package org.btm.jdbaApp;
import java.sql.*;
public class JdbcDemo 
{
	public static void main(String args[])
	{
		Connection conn=null;
		Statement stmt=null;
		try 
		{
			
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Are Loaded And Regitered");
		
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=guldu");
		System.out.println("Connection Established With Database Server...");
		stmt=conn.createStatement();
		System.out.println("Plateform Created...");
		}
		catch(ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if(stmt!=null)
			{
				try 
				{
					stmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if (conn!=null) 
			{
				try 
				{
					conn.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
			}
			System.out.println("Close All Costly Reasources...");
		}
		
	}
}
