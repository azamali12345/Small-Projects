package org.btm.jdbaApp;
import java.sql.*;
public class JdbcDemo3
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement stmt=null;
		String qry="update btm.student set name='Nupur' where id=6";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Class Loaded And Registered...");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=guldu");
			System.out.println("Connection Established With Batabase Server...");
			
			stmt=con.createStatement();
			System.out.println("Plateform Created...");
			
			stmt.executeUpdate(qry);
			System.out.println("Data Updated...");
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
