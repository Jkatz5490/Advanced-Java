package sqlPractice;

import java.sql.Connection; // Step 1: load driver
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Step 2: create connection object
		Connection connection = null;

		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 3: create connection object
		// 3rd parameneter is the password
		// database name, username, password
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "Limewild1234!");

		// create statement object

		Statement stat = connection.createStatement();

		// Step 4: Execute

		String strQuery = "select * from person";

		ResultSet rs = stat.executeQuery(strQuery);

		while (rs.next()) {
			System.out.println("Person Id: " + rs.getInt("id") + " Person LastName: " + rs.getString("lastname")
					+ rs.getString("firstname") + " Person Email: " + rs.getString("email"));
		}

		connection.close();

	}

}