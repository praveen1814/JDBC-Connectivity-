package JDBC_Connectivity.DataBase_Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String pwd="user";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,pwd);
		Statement st=con.createStatement();
		ResultSet set=st.executeQuery("Select * from employee;");
		System.out.println("empid\tempname\tdept\tloc ");
		while(set.next())
		{
			System.out.print(set.getInt(1)+"\t");
			System.out.print(set.getString(2)+"\t");
			System.out.print(set.getString(3)+"\t");
			System.out.print(set.getString(4)+"\n");
		}
		
	}

}
