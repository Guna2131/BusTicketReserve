
import java.util.*;

public class busticketsdemo {
	
	
	public static void main(String[] args)  {
		try {
		// TODO Auto-generated method stub
			while(true) {
			BusData.displaydata();
			int useropt=1;
			Scanner sc=new Scanner(System.in);
			while(useropt==1) {
				System.out.println("Enter 1 to book or 2 to Exit");
				useropt=sc.nextInt();
				if(useropt==1) {
					Booking book=new Booking();
					if(book.isAvailable()) {
						BookingDatas.add(book);
						System.out.println("Your booking is confirmed");
					}
				}
				else
					System.out.println("Sorry,bus is full.Try another bus");
				
			}
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

