package pam.setup;
import java.sql.*;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class Java2MySQL {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "subscriberdb";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "mypasswd";

		try {
			Class.forName(driver).newInstance();
			Connection conn = DriverManager.getConnection(url+dbName,userName,password);
			conn.close();
		} catch (Exception e) {
			;
			e.printStackTrace();
		}
	}
}
