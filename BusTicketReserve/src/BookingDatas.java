
import java.sql.*;
import java.util.Date;
public class BookingDatas {
	public static int getbookedcount(int busno, Date date) throws SQLException {
		String query="Select count(passenger_name) from booking where bus_no=? and travel_date=?";
		Connection con=DBconnection.getConnection();
		PreparedStatement pst =con.prepareStatement(query);
		java.sql.Date sqldate=  new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setDate(2, sqldate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		
		return rs.getInt(1);
		
	}
	public static void add(Booking book) throws SQLException {
		String query="INSERT INTO booking VALUES(?,?,?)";
		Connection con=DBconnection.getConnection();
		java.sql.Date sqldate=  new java.sql.Date(book.date.getTime());
		PreparedStatement pst =con.prepareStatement(query);
		pst.setString(1, book.Passengersname);
		pst.setInt(2, book.busno);
		pst.setDate(3, sqldate);
		pst.executeUpdate();
	}
}
