package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	public  static  Connection getCon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/broadway", "root", "");
			
			return con;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}
