package jdbc.com;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbCURD {

	
	public JdbCURD()
	{
		 try {
			 Statement stmt=null;
			Connection conn=null;
			stmt=conn.createStatement();
			String tablesql="create table  DEDUPE_TEST(ID integer(20),NAME varchar2(40),MOBILE NO varchar(20))";	

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
public Connection getConnection() throws Exception 
{
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@192.168.6.121:1522:orcl";
		Connection conn=DriverManager.getConnection(url,"rjio_e","rjio_e");
	} 
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}  
	
return null;	
}	


}
