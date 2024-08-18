import java.util.Scanner;
	public class BackToSenderLogistic{
		public static void main(String[] args){

		System.out.println("Application to Calculate Rider's Daily Wage!!!\n");
		
		System.out.printf("%50s%n", "Table for Commission per Parcel!!!");
		System.out.printf("%20s%20s%20s%n","Collection Rate", "Amount Per Parcel", "Base Pay");
		System.out.printf("%20s%20s%20s%n", "less than 50%", "160", "5,000");
		System.out.printf("%20s%20s%20s%n", "50 - 59%", "200", "5,000");
		System.out.printf("%20s%20s%20s%n","60 - 69%", "250", "5,000");
		System.out.printf("%20s%20s%20s%n","70% & Above", "500", "5,000");
		System.out.print(Logistics.dailyWages());

	}

}