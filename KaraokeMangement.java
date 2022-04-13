package JavaCore;

import java.time.LocalDateTime;
import java.util.Scanner;

public class KaraokeMangement {
		public static void main(String[] args) {
			
		  double PRICE_OF_EACH_WATTER_BOTTLE = 10000;
		  double PRICE_OF_THE_FIRST_3_HOURS = 30000;
		  // date is today
		  LocalDateTime today = LocalDateTime.now();
		  int years = today.getYear();
		  int month = today.getMonthValue();
		  int day = today.getDayOfMonth();
		  
		  String OPENNING_TIME = "9:00";
		  String CLOSING_TIME = "24:00";
		  
		  Scanner scanner = new Scanner(System.in);
		  System.out.print("enter start time: ");
		  String startTime = scanner.next();
		  System.out.print("enter end time: ");
		  String endTime = scanner.next();
		  System.out.print("enter the number Of Customers: ");
		  int numbeOfCustomers = scanner.nextInt();
		  System.out.println("enter the using time");
		  scanner.close();		  
		  System.out.println("Bill:" + Bill(startTime,endTime,numbeOfCustomers));
		   
	
		}
		
		public static double  Bill(String openningTime, String closingTime,double numberOfCustormers) {
			double total = 0;

			return total;
					
		}
}
