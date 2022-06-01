package sqlPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchExample {

	public static void main(String args[]) {

		List<EmployeeBean> list = new ArrayList<>();
		list.add(new EmployeeBean("Aditi", 20));
		list.add(new EmployeeBean("Aadhav", 21));
		list.add(new EmployeeBean("Shruti", 23));
		list.add(new EmployeeBean("Advaith", 22));
		list.add(new EmployeeBean("SSwati", 23));
		list.add(new EmployeeBean("Pradhyum", 23));
		list.add(new EmployeeBean("Sreekar", 23));

		getConnection();
		insertEmployee(list);
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			// Loading driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "Limewild1234!");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	private static void insertEmployee(List<EmployeeBean> empList) {
		Connection connection = null;
		String insertSQL = "Insert into employee (empname, empage) values (?, ?)";
		PreparedStatement prepStmt = null;
		try {
			connection = getConnection();
			prepStmt = connection.prepareStatement(insertSQL);
			for (int i = 0; i < empList.size(); i++) {
				EmployeeBean emp = empList.get(i);
				prepStmt.setString(1, emp.getName());
				prepStmt.setInt(2, emp.getAge());
				prepStmt.addBatch();
				// Process batch of 5 records if(i%100 ==0)105
				if (i % 5 == 0) {
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				// closing connection
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} // if condition
		}
	}

}
