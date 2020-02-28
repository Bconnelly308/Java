package SingleRepositoryHW;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
	
	private Connection conn;
	
	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	
	private DatabaseConnectionManager() {
		
	}
	
	public static DatabaseConnectionManager getManagerInstance() {
		return connectionInstance;
	}
	
	/**
	 * contains connection details
	 * 
	 * @throws SQLException
	 */
	
	public void connect() throws SQLException {
		// processing specific to database connection details..
		conn = DriverManager.getConnection("Somme/Database/URL");
		System.out.println("Establishing Database Connection..");
	}
	
	
	
	

}
