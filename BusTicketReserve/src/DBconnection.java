import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	private static final String url="jdbc:mysql://localhost:3306/busticketreserve";
	private static final String uname="root";
	private static final String password="Guna2131!";
	public	static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, uname, password);
	}
	

}
