package 数据服务类列表;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//public class MusicDataClient implements Runnable{
//    //共享资源(临界资源)
//    static int i=0;
//    Socket client;
//    int name;
//    public MusicDataClient(Socket clientSocket, int i) {
//        super();
//        name = i;
//        this.client = clientSocket;
//        Thread t=new Thread(this);
//        t.start();
//    }
//    /**
//     * synchronized 修饰实例方法
//     */
//    public synchronized void increase(){
//        i++;
//    }
//    @Override
//    public void run() {
//        for(int j=0;j<1000000;j++){
//            increase();
//        }
//    }
//    public static void main(String[] args) throws InterruptedException, IOException {
//        ServerSocket tcpServer = new ServerSocket(1110);
//        int i = 0;
//        while (true) {
//            System.out.println("服务器建立成功！正在等待连接......");
//            i++;
//            Socket clientSocket = tcpServer.accept();
//            new MusicDataClient(clientSocket, i);
//        }
//    }
//    /**
//     * 输出结果:
//     * 2000000
//     */
//}
public class MusicDataClient extends Thread {

    Socket client;
    int name;

    public MusicDataClient(Socket clientSocket, int i) {
        super();
        name = i;
        this.client = clientSocket;
    }
    public synchronized void DBSelect(ObjectOutputStream out,String str) throws IOException
    {
                       //System.out.println(name);
                switch (str) {
                    case "A":
                        //语句
                        out.writeObject(DataAccessor.getData("SELECT * FROM album"));
                        break; //可选
                    case "R":
                        //语句
                        out.writeObject(DataAccessor.getData("SELECT * FROM region"));
                        break; //可选
                    case "ALL":
                        //语句
                        out.writeObject(DataAccessor.getData("SELECT * FROM album,region,song WHERE album.regionid = region.regionid AND album.albumid = song.albumid"));
                        break; //可选
                    //你可以有任意数量的case语句
                    default: //可选
                    //语句
                }
    }
    @Override
    public void run() {
        System.out.println("已链接");
        InputStreamReader inSR = null;
        ObjectOutputStream out = null;
        try {
            //读取数据
            inSR = new InputStreamReader(client.getInputStream(), "UTF-8");
            BufferedReader br = new BufferedReader(inSR);
            out = new ObjectOutputStream(client.getOutputStream());
            String str = br.readLine();
            str = str.trim();
            System.out.println("收到客户端消息：" + str);
            DBSelect(out,str);
            //向客户端反馈消息，加上分行符以便客户端接收
            out.flush();
            inSR.close();
            out.close();
            client.close();
        } catch (IOException ex) {
            Logger.getLogger(MusicDataClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println("已断开");
    }

    public static void main(String[] args) throws IOException {
        //建立TCP连接服务,绑定端口
        ServerSocket tcpServer = new ServerSocket(1110);
        //接受连接,传图片给连接的客户端,每个TCP连接都是一个java线程
        int i = 0;
        while (true) {
            System.out.println("服务器建立成功！正在等待连接......");
            i++;
            Socket clientSocket = tcpServer.accept();
            new MusicDataClient(clientSocket, i).start();
        }
    }
}
