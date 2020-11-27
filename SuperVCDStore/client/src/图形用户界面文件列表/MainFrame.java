package ͼ���û������ļ��б�;
 
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MainFrame extends JFrame
{        
	static int notwice=1;
	static DefaultListModel<String> strlist=new DefaultListModel<String>();
	static JList<String> list=new JList<String>(strlist);
	static Map<String,List<String>> data =new HashMap<String, List<String>>();
	static int index;
	public MainFrame()
    {
    	MusicDataServer Client1 = new MusicDataServer();
    	MusicDataServer Client2 = new MusicDataServer();
    	data=Client2.setClientMessage("A");
    	new JFrame("SuperVCDStore");
    	setSize(400,200);
        setLayout(new BorderLayout());    //ΪFrame�������ò���ΪBorderLayout
        JPanel jp=new JPanel();    //�������
        JLabel label1=new JLabel("ѡ������Ŀ¼��");    //������ǩ
        JComboBox<String> cmb=new JComboBox<String>();    //����JComboBox
        Map<String,List<String>> data1=Client1.setClientMessage("R");
    	for(int i=0;i<data1.get("rname").size();i++) {
    		cmb.addItem(data1.get("rname").get(i)); 
    	}
        jp.add(label1);
        jp.add(cmb);
        cmb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            	//System.out.print(data.get("regionid"));
            	
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // ѡ���������ѡ��  
                	//System.out.println(e.getItem());
                	
                	String item=(String)e.getItem();
                    if(item.equals("��½")) {
                    	strlist=new DefaultListModel<String>();
                    	for(int i=0;i<data.get("singername").size();i++) {
                    		if(data.get("regionid").get(i).equals("1"))
                    		{
                    			strlist.addElement(data.get("singername").get(i)+" - "+data.get("albumname").get(i));
                    		}
                    	}
//                    	  strlist.addElement("����  - ������Ƥ����");
//                        strlist.addElement("���  - ��");
//                        strlist.addElement("����  - ����Բ�ȥ");
//                        strlist.addElement("���ľ�  - ����");
                    	index=1;
                        list.setModel(strlist);
                    }
                    else if(item.equals("�¼���")) {
                    	strlist=new DefaultListModel<String>();
                    	for(int i=0;i<data.get("singername").size();i++) {
                    		if(data.get("regionid").get(i).equals("2"))
                    		{
                    			strlist.addElement(data.get("singername").get(i)+" - "+data.get("albumname").get(i));
                    		}
                    	}
//                    	strlist.addElement("�ֿ���  - ΰ�����С");
//                        strlist.addElement("������  - ���");
//                        strlist.addElement("�̽���  - ����������");
//                        strlist.addElement("����  - ���");
                    	index=2;
                        list.setModel(strlist);
                    }
                    else if(item.equals("ŷ��")) {
                    	strlist=new DefaultListModel<String>();
                    	for(int i=0;i<data.get("singername").size();i++) {
                    		if(data.get("regionid").get(i).equals("3"))
                    		{
                    			strlist.addElement(data.get("singername").get(i)+" - "+data.get("albumname").get(i));
                    		}
                    	}
//                    	strlist.addElement("Westlife  - Coast To Coast");
//                        strlist.addElement("Ed Sheeran - ��");
//                        strlist.addElement("Taylor Swift  - Fearless");
//                        strlist.addElement("Justin Bieber  - Purpose");
                    	index=3;
                        list.setModel(strlist);
                    }
                    else if(item.equals("�۰�")) {
                    	strlist=new DefaultListModel<String>();
                    	for(int i=0;i<data.get("singername").size();i++) {
                    		if(data.get("regionid").get(i).equals("4"))
                    		{
                    			strlist.addElement(data.get("singername").get(i)+" - "+data.get("albumname").get(i));
                    		}
                    	}
//                    	strlist.addElement("��ѧ��  - �����װ���");
//                        strlist.addElement("������  - ʮ������");
//                        strlist.addElement("�Ͽ�ţ��  - ������㲻������");
//                        strlist.addElement("˳��  - ˳��");
                    	index=4;
                        list.setModel(strlist);
                    }
                }
            }
        });
        
        
        
        
        JPanel contentPane=new JPanel();    //�����������
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));    //�������ı߿�
        contentPane.setLayout(new BorderLayout(0, 0));    //�����������Ϊ�߽粼��
        //frame.setContentPane(contentPane);    //Ӧ���������
        JScrollPane scrollPane=new JScrollPane();    //�����������
        contentPane.add(scrollPane,BorderLayout.CENTER);    //��������ӵ��߽粼������
        //DefaultListModel<String> strlist=new DefaultListModel<String>();
        
        
        
        //����ֻ��ѡ��һ��Ԫ��
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);    //�ڹ����������ʾ�б�
        list.addListSelectionListener(new ListSelectionListener()
        {
            public void valueChanged(ListSelectionEvent e)
            {
            	notwice++;
        		if(notwice==3) {
        			notwice=1;
        			return;
        		}
        		else {
        			new MusicPanel(index,(list.getSelectedIndex()+(index-1)*4+1));
        			System.out.println(list.getSelectedIndex()+(index-1)*4+1);
        			System.out.println(index);
        		}
            }
        });
        
        
        
        
        
        
        JButton bClose = new JButton("Close");
        bClose.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent evt) {
            	//new MusicPanel();
            	dispose();
            }
        });
        add(bClose, BorderLayout.SOUTH);
        
        
        
        
        
        
        
        add(jp,BorderLayout.NORTH);
        add(contentPane,BorderLayout.CENTER);
        
        setJMenuBar(new MainMenu());
        
        setBounds(300,100,1280,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //System.out.println(cmb.getSelectedIndex());
        
    }
	 public static void main(String[] args) {
		 //MainFrame mf=new MainFrame();
		 int i=0;
		 while(i<10){
			i++;
			MusicDataServer Client2 = new MusicDataServer();
		    System.out.println(Client2.setClientMessage("R"));
		 }
	 }
}
