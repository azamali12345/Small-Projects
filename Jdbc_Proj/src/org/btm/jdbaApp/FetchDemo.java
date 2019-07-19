package org.btm.jdbaApp;
import java.sql.*;
import java.util.Scanner;
public class FetchDemo 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from btm.student where name=?";
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" Enter the name ");
		String name=sc.next();
		sc.close();
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=guldu");
			pstmt=con.prepareStatement(qry);
			//Set the value for placeHolder Before Execution//
			pstmt.setString(1,name);
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				int id=rs.getInt(1);
				double per=rs.getDouble(3);
				System.out.println(id+"  "+per);
			}
			else
			{
				System.err.println("data not found");
			}
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally 
		{
			if(rs!=null)
			{
				try 
				{
					rs.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if (pstmt!=null) 
			{
				try 
				{
					pstmt.close();
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
				if (con!=null) 
				{
					try 
					{
						pstmt.close();
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
