import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
		String Passengersname;
		int busno;
		Date date;
		
		Booking(){
			Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Name of the Passenger");
				Passengersname=sc.next();
				System.out.println("Enter the Bus No");
				busno=sc.nextInt();
				System.out.println("Enter the Date dd-mm-yyyy");
				String dateInput=sc.next();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
				
					try {
						date=dateFormat.parse(dateInput);
					}catch(ParseException e){
						e.printStackTrace();
					}
		}
		public boolean isAvailable() throws SQLException {
			int capacity=BusData.getCapacity(busno);
			int booked=BookingDatas.getbookedcount(busno,date);
			return booked<capacity;
		}
}
