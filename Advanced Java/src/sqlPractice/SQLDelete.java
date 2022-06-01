package sqlPractice;

import java.sql.Connection; // Step 1: load driver
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class SQLDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null; // create connection object
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "Limewild1234!");
		String deleteSQL = "Delete from employee where empid=?";
		PreparedStatement prepStmt = null;
		try {
			prepStmt = connection.prepareStatement(deleteSQL);
			prepStmt.setInt(1, 3);
			int count = prepStmt.executeUpdate();
			System.out.println("Count of rows deleted " + count);
		} finally {

			if (prepStmt != null) {
				prepStmt.close();
			}
		}
	}
}
