import java.util.Scanner;
	public class Logistics{
		public static int dailyWages(){
			Scanner input = new Scanner(System.in);

		int basePay = 5000;
		int amountPerParcel = 0;
		

			
		System.out.println("Enter Number of Successful Delivery: ");
		int successfulDelivery = input.nextInt();

			if(successfulDelivery >= 1 && successfulDelivery < 50){
				
				amountPerParcel = 160 ;
				int dailyWage = successfulDelivery * amountPerParcel + basePay;
				System.out.printf("This Rider has earned %d percent Commission Per Parcel! %n", amountPerParcel);
				System.out.printf("Rider's Daily Wage is : %d%n", dailyWage);

			}
			else if(successfulDelivery == 50 && successfulDelivery <= 59){
				
				amountPerParcel = 200 ;
				int dailyWage = successfulDelivery * amountPerParcel + basePay;
				System.out.printf("This Rider has earned %d percent Commission Per Parcel! %n", amountPerParcel);
				System.out.printf("Rider's Daily Wage is : %d%n", dailyWage);

			}
			else if(successfulDelivery == 60 && successfulDelivery <= 69){
				
				amountPerParcel = 250 ;
				int dailyWage = successfulDelivery * amountPerParcel + basePay;
				System.out.printf("This Rider has earned %d percent Commission Per Parcel! %n", amountPerParcel);
				System.out.printf("Rider's Daily Wage is : %d%n", dailyWage);

			}
			else if(successfulDelivery >= 70){
				
				amountPerParcel = 500 ;
				int dailyWage = successfulDelivery * amountPerParcel + basePay;
				System.out.printf("This Rider has earned %d percent Commission Per Parcel! %n", amountPerParcel);
				System.out.printf("Rider's Daily Wage is : %d%n", dailyWage);

			}
			else if(successfulDelivery <= 0){
				System.out.printf("No Commission Earned!");
				}

			
			
			return 0;
			

		
	}
}