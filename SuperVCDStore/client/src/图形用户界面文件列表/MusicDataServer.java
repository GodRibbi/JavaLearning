package ͼ���û������ļ��б�;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
  
  
public class MusicDataServer {

    private Socket client;  //����ͻ����׽���
    //����ͻ�����Ϣд�뺯��
    Map<String,List<String>> setClientMessage(String str) {
        try {
            client = new Socket("127.0.0.1", 1110); //�����ͻ��ˣ�ʹ�õ�IPΪ127.0.0.1���˿ںͷ�����һ��Ϊ1100
            System.out.println("�ͻ��˽����ɹ���");
            
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

            //������Ϣ
            //byte bytes[] = new byte[100];
            System.out.println("----------------------------------");
            //System.in.read(bytes);
            str = str.trim();
            System.out.println(str);
            //��������
            bw.write(str + "\r\n");		//���Ϸ��з����Ա���������ж�ȡ
            bw.flush();
            data=new HashMap<String, List<String>>();
            data=(Map<String, List<String>>) in.readObject();
            //System.out.println("�������ظ���" + data);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
            //����ͻ�����Ϣ����Ϊ�գ���˵���ͻ����Ѿ��������ӣ��رտͻ���
            if (client != null) {
                client.close();
                System.out.println("�ѶϿ�");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return data;
    }
}

























