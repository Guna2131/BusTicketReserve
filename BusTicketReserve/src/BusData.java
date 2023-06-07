import java.sql.*;

public class BusData {
	public static void displaydata() throws SQLException {
		String query="SELECT * FROM bus";
		Connection con=DBconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.print("BUS ID: "+rs.getInt(1)+", ");
			if(rs.getInt(2)==1)
				System.out.print("AC: Yes"+", ");
			else
				System.out.print("AC: No"+", ");
				
			System.out.println("BUS CAPAICITY: "+rs.getInt(3));
			
		}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public static int getCapacity(int bus_id) throws SQLException {
		String query="SELECT capacity FROM bus WHERE bus_id="+bus_id;
		Connection con=DBconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		}
	}
