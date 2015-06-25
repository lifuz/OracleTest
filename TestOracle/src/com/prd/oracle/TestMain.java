package com.prd.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 测试数据库连接
 * @author 半夏微凉
 *
 */

public class TestMain {

	public static void main(String[] args) throws Exception {
		
		//获取数据库连接
		Connection conn =  TestConnect.getConnection();
		
//		String sql = "select * from emp";
//		PreparedStatement pt = conn.prepareStatement(sql);
//		ResultSet rs = pt.executeQuery();
//		
//		while(rs.next()){
//			System.out.println(rs.getString(2));
//		}
		
		String sql = "insert into dept values(50,'安卓','shanghai')";
		PreparedStatement pt = conn.prepareStatement(sql);
		pt.execute();
		sql = "select * from dept";
		pt = conn.prepareStatement(sql);
		ResultSet rs = pt.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
		

	}

}
