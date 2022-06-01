package sqlPractice;

import java.sql.Connection; // Step 1: load driver
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("unused")
public class DisplayParticularRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null; /* create connection object */
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "Limewild1234!");

		String selectSQL = "Select * from employee where empid = ?";
		PreparedStatement prepStmt = null;
		try {
			prepStmt = connection.prepareStatement(selectSQL);
			prepStmt.setInt(1, 1); /* if was a foreign key, will display only 1 particular record */
			ResultSet rs = prepStmt.executeQuery();
			while (rs.next()) {
				System.out.println("id: " + rs.getInt("empid") + " Name: " + rs.getString("empname") + " Age: "
						+ rs.getInt("empage"));
			}
		} finally {
			if (prepStmt != null) {
				prepStmt.close();
			}
		}

	}

}
