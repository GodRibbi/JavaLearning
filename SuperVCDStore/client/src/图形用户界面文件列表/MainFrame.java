package 图形用户界面文件列表;
 
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
        setLayout(new BorderLayout());    //为Frame窗口设置布局为BorderLayout
        JPanel jp=new JPanel();    //创建面板
        JLabel label1=new JLabel("选择音乐目录：");    //创建标签
        JComboBox<String> cmb=new JComboBox<String>();    //创建JComboBox
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
                    // 选择的下拉框选项  
                	//System.out.println(e.getItem());
                	
                	String item=(String)e.getItem();
                    if(item.equals("大陆")) {
                    	strlist=new DefaultListModel<String>();
                    	for(int i=0;i<data.get("singername").size();i++) {
                    		if(data.get("regionid").get(i).equals("1"))
                    		{
                    			strlist.addElement(data.get("singername").get(i)+" - "+data.get("albumname").get(i));
                    		}
                    	}
//                    	  strlist.addElement("刀郎  - 披着狼皮的羊");
//                        strlist.addElement("李宇春  - 哇");
//                        strlist.addElement("许嵩  - 不如吃茶去");
//                        strlist.addElement("满文军  - 望乡");
                    	index=1;
                        list.setModel(strlist);
                    }
                    else if(item.equals("新加坡")) {
                    	strlist=new DefaultListModel<String>();
                    	for(int i=0;i<data.get("singername").size();i++) {
                    		if(data.get("regionid").get(i).equals("2"))
                    		{
                    			strlist.addElement(data.get("singername").get(i)+" - "+data.get("albumname").get(i));
                    		}
                    	}
//                    	strlist.addElement("林俊杰  - 伟大的渺小");
//                        strlist.addElement("孙燕姿  - 逆光");
//                        strlist.addElement("蔡健雅  - 若你碰到他");
//                        strlist.addElement("阿杜  - 天黑");
                    	index=2;
                        list.setModel(strlist);
                    }
                    else if(item.equals("欧美")) {
                    	strlist=new DefaultListModel<String>();
                    	for(int i=0;i<data.get("singername").size();i++) {
                    		if(data.get("regionid").get(i).equals("3"))
                    		{
                    			strlist.addElement(data.get("singername").get(i)+" - "+data.get("albumname").get(i));
                    		}
                    	}
//                    	strlist.addElement("Westlife  - Coast To Coast");
//                        strlist.addElement("Ed Sheeran - ÷");
//                        strlist.addElement("Taylor Swift  - Fearless");
//                        strlist.addElement("Justin Bieber  - Purpose");
                    	index=3;
                        list.setModel(strlist);
                    }
                    else if(item.equals("港澳")) {
                    	strlist=new DefaultListModel<String>();
                    	for(int i=0;i<data.get("singername").size();i++) {
                    		if(data.get("regionid").get(i).equals("4"))
                    		{
                    			strlist.addElement(data.get("singername").get(i)+" - "+data.get("albumname").get(i));
                    		}
                    	}
//                    	strlist.addElement("张学友  - 给我亲爱的");
//                        strlist.addElement("林子祥  - 十三子祥");
//                        strlist.addElement("迪克牛仔  - 我这个你不爱的人");
//                        strlist.addElement("顺子  - 顺子");
                    	index=4;
                        list.setModel(strlist);
                    }
                }
            }
        });
        
        
        
        
        JPanel contentPane=new JPanel();    //创建内容面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));    //设置面板的边框
        contentPane.setLayout(new BorderLayout(0, 0));    //设置内容面板为边界布局
        //frame.setContentPane(contentPane);    //应用内容面板
        JScrollPane scrollPane=new JScrollPane();    //创建滚动面板
        contentPane.add(scrollPane,BorderLayout.CENTER);    //将面板增加到边界布局中央
        //DefaultListModel<String> strlist=new DefaultListModel<String>();
        
        
        
        //限制只能选择一个元素
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);    //在滚动面板中显示列表
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
