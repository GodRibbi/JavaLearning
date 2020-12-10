package com.DataClient;

import java.util.List;
import java.sql.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DataAccessor {
    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/zrq?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false";
 
 
    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "111111";
	public Map<String,List<String>> getSong(String sql){
		Connection conn = null;
        Statement stmt = null;
        Map<String,List<String>> data= new HashMap<>();
        List<String> songidlist = new LinkedList<>();
        List<String> albumidlist = new LinkedList<>();
        List<String> snamelist = new LinkedList<>();
        List<String> longlist = new LinkedList<>();
        try{     
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            // 执行查询
            //System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            //sql = "SELECT * FROM song";
            ResultSet rs = stmt.executeQuery(sql);
            //System.out.print(rs);
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
            	String songid  = rs.getString("songid");
                String albumid  = rs.getString("albumid");
                String sname = rs.getString("sname");
                String length = rs.getString("long");

                
                songidlist.add(songid);
                albumidlist.add(albumid);
                snamelist.add(sname);
                longlist.add(length);
                
                // 输出数据
                //System.out.print("ID: " + songid);
                //System.out.print("专辑id: " + albumid);
                //System.out.print(", 名称: " + name);
                //System.out.print(", 时长: " + length);
                //System.out.print("\n");
            }
            // 完成后关闭
            //System.out.print(", 名称: " + namelist);
            data.put("songid",songidlist);
            data.put("albumid",albumidlist);
            data.put("sname",snamelist);
            data.put("long",longlist);
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
		return data;
	}
	
	public Map<String,List<String>> getAlbum(String sql){
		Connection conn = null;
        Statement stmt = null;
        Map<String,List<String>> data= new HashMap<>();
        List<String> albumidlist = new LinkedList<>();
        List<String> regionidlist = new LinkedList<>();
        List<String> singernamelist = new LinkedList<>();
        List<String> albumnamelist = new LinkedList<>();
        List<String> longlist = new LinkedList<>();
        List<String> costlist = new LinkedList<>();
        try{     
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            // 执行查询
            //System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            //sql = "SELECT * FROM song";
            ResultSet rs = stmt.executeQuery(sql);
            //System.out.print(rs);
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                String albumid  = rs.getString(1);
                String regionid  = rs.getString("regionid");
                String singername = rs.getString("singername");
                String albumname = rs.getString(4);
                String length = rs.getString("long");
                String cost = rs.getString("cost");

                
                albumidlist.add(albumid);
                regionidlist.add(regionid);
                singernamelist.add(singername);
                albumnamelist.add(albumname);
                longlist.add(length);
                costlist.add(cost);
                
                // 输出数据
                //System.out.print("ID: " + songid);
                //System.out.print("专辑id: " + albumid);
                //System.out.print(", 名称: " + name);
                //System.out.print(", 时长: " + length);
                //System.out.print("\n");
            }
            // 完成后关闭
            //System.out.print(", 名称: " + namelist);
            data.put("albumid",albumidlist);
            data.put("regionid",regionidlist);
            data.put("singername",singernamelist);
            data.put("albumname",albumnamelist);
            data.put("long",longlist);
            data.put("cost",costlist);
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
		return data;
	}
	
	public Map<String,List<String>> getRegion(String sql){
		Connection conn = null;
        Statement stmt = null;
        Map<String,List<String>> data= new HashMap<>();
        
        List<String> regionidlist = new LinkedList<>();
        List<String> namelist = new LinkedList<>();
        try{     
            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            // 执行查询
            //System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            //sql = "SELECT * FROM song";
            ResultSet rs = stmt.executeQuery(sql);
            //System.out.print(rs);
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                String regionid  = rs.getString("regionid");
                String name = rs.getString(2);

                
                regionidlist.add(regionid);
                namelist.add(name);
                
                // 输出数据
                //System.out.print("ID: " + songid);
                //System.out.print("专辑id: " + albumid);
                //System.out.print(", 名称: " + name);
                //System.out.print(", 时长: " + length);
                //System.out.print("\n");
            }
            // 完成后关闭
            //System.out.print(", 名称: " + namelist);
            data.put("regionid",regionidlist);
            data.put("name",namelist);
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
		return data;
	}
	
	public static Map<String,List<String>> getData(String sql){
	Connection conn = null;
        Statement stmt = null;
        Map<String,List<String>> data= new HashMap<>();
        //List<String> songidlist = new LinkedList<>();
        //List<String> albumidlist = new LinkedList<>();
        //List<String> snamelist = new LinkedList<>();
        //List<String> longlist = new LinkedList<>();
        try{     
            // 打开链接
            System.out.println("连接数据库...");
            //Class.forName(DB_URL).newInstance();
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        
            // 执行查询
            //System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            //sql = "SELECT * FROM song";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            List<String> name=new LinkedList<String>();
            List<List<String>> detail=new LinkedList<List<String>>();
            int col = rsmd.getColumnCount();
            for(int i=1;i<=col;i++) {
                name.add(rsmd.getColumnName(i));
                detail.add(new LinkedList<String>());
            }
            //System.out.print(name);
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
            	//String songid  = rs.getString("songid");
                //String albumid  = rs.getString("albumid");
                //String sname = rs.getString("sname");
                //String length = rs.getString("long");
                for(int i=0;i<col;i++) {
                	String sqldata  = rs.getString(i+1);
                	detail.get(i).add(sqldata);
                }

                //i++;
                //System.out.print(1);
                //songidlist.add(songid);
                //albumidlist.add(albumid);
                //snamelist.add(sname);
                //longlist.add(length);
                
                // 输出数据
                //System.out.print("ID: " + songid);
                //System.out.print("专辑id: " + albumid);
                //System.out.print(", 名称: " + name);
                //System.out.print(", 时长: " + length);
                //System.out.print("\n");
            }
            // 完成后关闭
            //System.out.print(", 名称: " + namelist);
            //data.put("songid",songidlist);
            //data.put("albumid",albumidlist);
            //data.put("sname",snamelist);
            //data.put("long",longlist);
            for(int i=0;i<col;i++) {
            	data.put(name.get(i),detail.get(i));
            }
            
            System.out.println("连接成功");
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        //System.out.print(data);
		return data;
	}

}
