package ma.fstt.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static Connection connection;
	private String url = "jdbc:mysql://localhost:8889/db_gestioncommande";
	private String user = "root";
	private String password = "root";
	
	private ConnectionManager() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(url, user, password);
	}
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		if(connection == null)
			new ConnectionManager();
		return connection;
	}
}
