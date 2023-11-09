package Main;

import java.sql.Connection;
import java.sql.SQLException;

import Jdbc.util.Dbutil;



public class DbMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con=Dbutil.dbConn();
		
		if(con!=null) {
			System.out.println("dB connection is established successfully....");
		}

	}
}


