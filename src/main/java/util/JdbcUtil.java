package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import impl.JdbcConnection;
import inter.DataSource;

public class JdbcUtil {
	
	//用来获得Connection的对象
	private static DataSource jc= new JdbcConnection();
	public static Connection getConnection(){
		return jc.getConnection();
	}//ֱ
	public static void release(Connection conn,Statement st,ResultSet rs){
		 if(rs!=null){
	            try{//关闭存储查询结果的ResultSet对象
	                rs.close();
	            }catch (Exception e) {
	                e.printStackTrace();
	            }
	            rs = null;
	        }
	        if(st!=null){
	            try{
	                //关闭负责执行SQL命令的Statement对象
	                st.close();
	            }catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        
	        if(conn!=null){
	            try{
	                //关闭Connection数据库连接对象
	                conn.close();
	            }catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	}
}
