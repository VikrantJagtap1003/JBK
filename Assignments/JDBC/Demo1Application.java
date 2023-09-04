package com.example.one.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;





public class Demo1Application {

	public static void main(String[] args) throws SQLException {
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/springjdbc","root","root");
		
		Statement st = connection.createStatement();
		
		
		String queryString="select * from user";
		ResultSet resultset=st.executeQuery(queryString); 
		while(resultset.next())
		{
			String id=resultset.getString(1);
			String name=resultset.getString(3);
			String city=resultset.getString(2);
			System.out.println(id+" , "+name+" , "+city);
		}
		
//		String query2="insert into user values(1,'Pune','Harshwardhan')";
//		int val=st.executeUpdate(query2);
//		System.out.print(val);
		
		String query3="update user set id=205 where id=204";
		int val1=st.executeUpdate(query3);
		System.out.println(val1);
		
		String query4="delete from user where id=203";
		int val2=st.executeUpdate(query4);
		System.out.println(val2);
	}

}
