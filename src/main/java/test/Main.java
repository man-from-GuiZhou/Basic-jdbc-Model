package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JdbcUtil;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSelect();
	}
	public static void testSelect(){
		Connection conn=null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn=JdbcUtil.getConnection();
			String sql="select * from user_account";
			st=conn.prepareStatement(sql);
			rs = st.executeQuery(sql);
           // int num = st.executeUpdate();
           // if(num>0){
                System.out.println("查询成功！！");
                while(rs.next()){
                	System.out.println(""+rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
                }
           // }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
            JdbcUtil.release(conn, st, rs);
		}
	}
}
