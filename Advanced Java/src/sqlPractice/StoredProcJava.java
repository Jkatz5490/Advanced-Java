package sqlPractice;

import java.sql.CallableStatement;
import java.sql.Connection; // Step 1: load driver
import java.sql.DriverManager;
import java.sql.JDBCType;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class StoredProcJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * Stored Proc being used: CREATE DEFINER=`root`@`localhost` PROCEDURE
		 * `selectperson`(IN param_id int, OUT param_fname varchar(23), OUT param_lname
		 * varchar(23)) BEGIN select lastname,firstname INTO param_lname,param_fname
		 * from person where id=param_id; END
		 * 
		 * stored proc must always
		 */

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = null; /* create connection object */
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "Limewild1234!");
		/*
		 * call the name of your stored procedure
		 */
		CallableStatement cStatement = connection.prepareCall("{call selectperson(?, ?, ?)}");
		// Setting params
		cStatement.setInt(1, /* id number you're fetching: */1); /* argument 1 is for ID, then choose which ID you want from the database to show */ 
									
		
		cStatement.registerOutParameter(2, JDBCType.VARCHAR);

		cStatement.registerOutParameter(3, JDBCType.VARCHAR);

		cStatement.executeQuery();

		// Reading the OUT paramter here
		System.out.println(
				"Fetched Result " + "LastName: " + cStatement.getString(2) + " FirstName: " + cStatement.getString(3));

	}

}
