package 图形用户界面文件列表;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
  
  
public class MusicDataServer {

    private Socket client;  //定义客户端套接字
    //定义客户端信息写入函数
    Map<String,List<String>> setClientMessage(String str) {
        try {
            client = new Socket("127.0.0.1", 1110); //建立客户端，使用的IP为127.0.0.1，端口和服务器一样为1100
            System.out.println("客户端建立成功！");
            
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    	Map<String,List<String>> data=null;
        try {
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());

            DataOutputStream dataOS = new DataOutputStream(client.getOutputStream());
            OutputStreamWriter outSW = new OutputStreamWriter(dataOS, "UTF-8");
            BufferedWriter bw = new BufferedWriter(outSW);

            //输入信息
            //byte bytes[] = new byte[100];
            System.out.println("----------------------------------");
            //System.in.read(bytes);
            str = str.trim();
            System.out.println(str);
            //发送数据
            bw.write(str + "\r\n");		//加上分行符，以便服务器按行读取
            bw.flush();
            data=new HashMap<String, List<String>>();
            data=(Map<String, List<String>>) in.readObject();
            //System.out.println("服务器回复：" + data);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
            //如果客户端信息流不为空，则说明客户端已经建立连接，关闭客户端
            if (client != null) {
                client.close();
                System.out.println("已断开");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return data;
    }
}

























