package 图形用户界面文件列表;
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
		setTitle("歌曲详情");    //设置显示窗口标题
		MusicDataServer Client = new MusicDataServer();
		Map<String,List<String>> data =new HashMap<String, List<String>>();
		data=Client.setClientMessage("ALL");
		
		//System.out.print(data);
        //整体布局
        Box pagebox=Box.createVerticalBox();    //主页
        Box upbox=Box.createHorizontalBox();    //上方容器
        Box borrowbox=Box.createHorizontalBox();    //下方容器
        Box upleftbox=Box.createVerticalBox();    //左上方容器
        Box uprightbox=Box.createVerticalBox();    //右上方容器
        
        String singer="error";
        String songname="error";
        String songtype="error";
        String songlength="error";
        String songcost="error";
        String imgurl="";
        for(int i=0;i<data.get("regionid").size();i++) {
			if(Integer.parseInt(data.get("albumid").get(i)) == index) {
				singer="歌手: "+data.get("singername").get(i);
				songname="歌名: "+data.get("albumname").get(i);
				songtype="类别: "+data.get("rname").get(i);
				songlength="长度: "+data.get("long").get(i)+"分";
				songcost="价格: "+data.get("cost").get(i)+"￥";
				imgurl=data.get("imageurl").get(i);
				break;
			}
		}
        //左上显示
        
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
        ii.setImage(ii.getImage().getScaledInstance(200, 230,Image.SCALE_DEFAULT));//height,width-照片的高度度和宽度
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
//        singerlist.addElement("1.不准点火");
//        singerlist.addElement("2.给我亲爱的");
//        singerlist.addElement("3.忘情负义");
//        singerlist.addElement("4.Cry!");
//        singerlist.addElement("5.旧信旧梦");
//        singerlist.addElement("6.Linda");
//        singerlist.addElement("7.法国餐厅");
//        singerlist.addElement("8.热情面具");
//        singerlist.addElement("9.仍是会喜欢你");
//        singerlist.addElement("10.圈圈");
        
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
        //add(b1);    //将外层横向Box添加进窗体
        //b1.add(Box.createVerticalStrut(400));    //添加高度为200的垂直框架
        //b1.add(new JButton("西"));    //添加按钮1
        //b1.add(Box.createHorizontalStrut(140));    //添加长度为140的水平框架 
        //b1.add(new JButton("东"));    //添加按钮2
        //b1.add(Box.createHorizontalGlue());    //添加水平胶水
        //b1.add(b2);    //添加嵌套的纵向Box容器
        //添加宽度为100，高度为20的固定区域  
        //b2.add(Box.createRigidArea(new Dimension(100,20))); 
        //b2.add(new JButton("北"));    //添加按钮3
        //b2.add(Box.createVerticalGlue());    //添加垂直组件
        //b2.add(new JButton("南"));    //添加按钮4
        //b2.add(Box.createVerticalStrut(40));    //添加长度为40的垂直框架
        //设置窗口的关闭动作、标题、大小位置以及可见性等  
        setContentPane(pagebox);
        setBounds(400,200,400,500); 
        setVisible(true); 
	}
}
