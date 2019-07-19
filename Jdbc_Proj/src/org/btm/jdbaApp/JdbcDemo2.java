package org.btm.jdbaApp;
import java.sql.*;
public class JdbcDemo2 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		String qry="insert into btm.student values(9,'Wasim',19.99)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Class Loaded And Registered...");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=guldu");
			System.out.println("Connection Established With Database Server...");
			stmt=con.createStatement();
			System.out.println("Plateform Created...");
			stmt.executeUpdate(qry);
			System.out.println("Data Inserted...");
		} 
		catch (ClassNotFoundException | SQLException e) 
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
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try
				{
					con.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

}
