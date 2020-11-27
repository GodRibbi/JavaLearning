package ͼ���û������ļ��б�;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MusicPanel extends JFrame{

	public MusicPanel(int regionIndex,int index){
		setTitle("��������");    //������ʾ���ڱ���
		MusicDataServer Client = new MusicDataServer();
		Map<String,List<String>> data =new HashMap<String, List<String>>();
		data=Client.setClientMessage("ALL");
		
		//System.out.print(data);
        //���岼��
        Box pagebox=Box.createVerticalBox();    //��ҳ
        Box upbox=Box.createHorizontalBox();    //�Ϸ�����
        Box borrowbox=Box.createHorizontalBox();    //�·�����
        Box upleftbox=Box.createVerticalBox();    //���Ϸ�����
        Box uprightbox=Box.createVerticalBox();    //���Ϸ�����
        
        String singer="error";
        String songname="error";
        String songtype="error";
        String songlength="error";
        String songcost="error";
        String imgurl="";
        for(int i=0;i<data.get("regionid").size();i++) {
			if(Integer.parseInt(data.get("albumid").get(i)) == index) {
				singer="����: "+data.get("singername").get(i);
				songname="����: "+data.get("albumname").get(i);
				songtype="���: "+data.get("rname").get(i);
				songlength="����: "+data.get("long").get(i)+"��";
				songcost="�۸�: "+data.get("cost").get(i)+"��";
				imgurl=data.get("imageurl").get(i);
				break;
			}
		}
        //������ʾ
        
        JLabel singerjl=new JLabel(singer);
        upleftbox.add(singerjl);
        
        JLabel singnamejl=new JLabel(songname);
        upleftbox.add(singnamejl);
        
        JLabel singtypejl=new JLabel(songtype);
        upleftbox.add(singtypejl);
        
        JLabel singlengthjl=new JLabel(songlength);
        upleftbox.add(singlengthjl);
        
        JLabel singcostjl=new JLabel(songcost);
        upleftbox.add(singcostjl);
        
        
        ImageIcon ii = new ImageIcon(imgurl);
        ii.setImage(ii.getImage().getScaledInstance(200, 230,Image.SCALE_DEFAULT));//height,width-��Ƭ�ĸ߶ȶȺͿ��
        JLabel img= new JLabel(ii);
        uprightbox.add(img);
        upbox.add(upleftbox);
        upbox.add(Box.createHorizontalStrut(50)); 
        upbox.add(uprightbox);
        
        DefaultListModel<String> singerlist=new DefaultListModel();
        int j=1;
        for(int i=0;i<data.get("regionid").size();i++) {
			if(Integer.parseInt(data.get("albumid").get(i)) == index) {
				singerlist.addElement(j+"."+data.get("sname").get(i));
				j++;
			}
		}
//        singerlist.addElement("1.��׼���");
//        singerlist.addElement("2.�����װ���");
//        singerlist.addElement("3.���鸺��");
//        singerlist.addElement("4.Cry!");
//        singerlist.addElement("5.���ž���");
//        singerlist.addElement("6.Linda");
//        singerlist.addElement("7.��������");
//        singerlist.addElement("8.�������");
//        singerlist.addElement("9.���ǻ�ϲ����");
//        singerlist.addElement("10.ȦȦ");
        
        JList<String> singerjs=new JList<String>(singerlist);
        singerjs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        singerjs.setSelectedIndex(0);
        
        JScrollPane singdetailjsp=new JScrollPane(singerjs);
        borrowbox.setBorder(BorderFactory.createTitledBorder("List of Tracks"));
        borrowbox.add(singdetailjsp);
        
        pagebox.add(Box.createVerticalStrut(20)); 
        pagebox.add(upbox);
        pagebox.add(Box.createVerticalStrut(10)); 
        pagebox.add(borrowbox);
        
        
        JButton bClose = new JButton("OK");
        bClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
            	dispose();
            }
        });
        pagebox.add(bClose);
        //add(b1);    //��������Box��ӽ�����
        //b1.add(Box.createVerticalStrut(400));    //��Ӹ߶�Ϊ200�Ĵ�ֱ���
        //b1.add(new JButton("��"));    //��Ӱ�ť1
        //b1.add(Box.createHorizontalStrut(140));    //��ӳ���Ϊ140��ˮƽ��� 
        //b1.add(new JButton("��"));    //��Ӱ�ť2
        //b1.add(Box.createHorizontalGlue());    //���ˮƽ��ˮ
        //b1.add(b2);    //���Ƕ�׵�����Box����
        //��ӿ��Ϊ100���߶�Ϊ20�Ĺ̶�����  
        //b2.add(Box.createRigidArea(new Dimension(100,20))); 
        //b2.add(new JButton("��"));    //��Ӱ�ť3
        //b2.add(Box.createVerticalGlue());    //��Ӵ�ֱ���
        //b2.add(new JButton("��"));    //��Ӱ�ť4
        //b2.add(Box.createVerticalStrut(40));    //��ӳ���Ϊ40�Ĵ�ֱ���
        //���ô��ڵĹرն��������⡢��Сλ���Լ��ɼ��Ե�  
        setContentPane(pagebox);
        setBounds(400,200,400,500); 
        setVisible(true); 
	}
}
