package Controller;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Mysql.*;

public abstract class salesController{

	public salesController() {
		super();
	}
	
	public static void getSellers() {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = Connect.getConnection();
	
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + " - " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			Connect.closeResultSet(rs);
			Connect.closeStatement(st);
			Connect.closeConnection();
		}
	
	}
	

}
