package sqlPractice;

import java.sql.Connection; // Step 1: load driver
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class PrepStatExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null; // create connection object
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "Limewild1234!");
		
		/*
		 *  fields such as id, lastname, firstname, email, need to match perfectly from database, (case sensitive) 
		 */
		String insertQuery = "insert into person(id,lastname,firstname,email) values (?,?,?,?)";

		PreparedStatement ps = connection.prepareStatement(insertQuery);
		ps.setInt(1, 123);
		ps.setString(2, "TestfromJavaLN");
		ps.setString(3, "TestfromJavaFN");
		ps.setString(4, "TestfromJavaEmail");

		int count = ps.executeUpdate();

		System.out.println("rows affected " + count);

		connection.close();

	}

}
