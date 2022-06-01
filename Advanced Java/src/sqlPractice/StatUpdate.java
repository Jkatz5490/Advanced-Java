package sqlPractice;

import java.sql.Connection; // Step 1: load driver
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("unused")
public class StatUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null; // create connection object
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "Limewild1234!");

		// String insertQuery = "insert into person(id,lastname,firstname,email) values
		// (?,?,?,?)";

		// arguments in order, first 1 targets first name, second arg targets last name,
		// third arg targets id
		// 1 2 3
		String updateQry = "update Person set firstname=?, lastname=? where id=?";
		/*
		 * second param refers to the database info you're targetting
		 */

		PreparedStatement ps = connection.prepareStatement(updateQry);
		ps.setString(1, "bananafirstname2");
		ps.setString(2, "lastnametest2");
		ps.setInt(3, 3);
		/*
		 * ps.setString(3, "TestUpdateJava2"); ps.setString(4,
		 * "TestUpdateJava2@gmail.com");
		 */
		int count = ps.executeUpdate();

		System.out.println(count + " record(s) updated");
		connection.close();

	}

}
