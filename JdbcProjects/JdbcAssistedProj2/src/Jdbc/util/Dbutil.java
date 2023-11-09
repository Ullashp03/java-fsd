package Jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {

	public static Connection dbConn() throws ClassNotFoundException, SQLException {
		
		//Register the driver 
		Class.forName(ConstantPool.DRIVER_CLASS);
		//connection with the dB 
		Connection con=DriverManager.getConnection(ConstantPool.DB_URL,ConstantPool.USERNAME,ConstantPool.PASSWORD);
		return con;
	}
	
}
