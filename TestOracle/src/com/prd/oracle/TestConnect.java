package com.prd.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 建立与Oracle数据库的连接
 * @author 半夏微凉
 *
 */

public class TestConnect {
	
	static String driver;
	static String url ;
	static String user;
	static String password;
	
	/**
	 * 
	 * 获取数据库连接
	 * 
	 * @return 数据库连接Connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		//定义数据库的驱动类
		driver = "oracle.jdbc.driver.OracleDriver";
		//拼接访问的url
		url = "jdbc:oracle:thin:@121.40.199.67:1521:orcl";
		//设置用户名
		user = "scott";
		//设置密码
		password = "tiger";
		//加载 驱动
		Class.forName(driver);
		
		//返回数据库连接
		return DriverManager.getConnection(url, user, password);
	}

}
