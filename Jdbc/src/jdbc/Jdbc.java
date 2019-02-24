package jdbc;

import java.sql.*;

public class Jdbc
{
	public static void main(String[] args)throws Exception 
	{

		 Class.forName("oracle.jdbc.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","tiger","scott");
           

           Statement st= con.createStatement();
           boolean flag = false;

           ResultSet rs= st.executeQuery("select * from food");
           while(rs.next())
           {
           	flag = true;
           	  System.out.println(rs.getInt(1)+".."+rs.getString(2)+".."+rs.getInt(3));

           }
         if(flag=false)
         {
         	System.out.println("no records");
         }  
           con.close();	 
	}
}