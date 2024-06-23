import java.util.Scanner;
	public class DisplayLargestandSmallest{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

				System.out.println("Application to Display the Largest and Smallest Numbers!!!");

				int count = 0;
				int Largest = 0;
				int Smallest = 0;

			System.out.println("Enter Numbers to Compare Below!");
			System.out.println("Note!... Enter (-1) to displpay Result!!!");
			int number = input.nextInt();

		while(number != -1){
			Largest = number;
			number = input.nextInt();

			if(Largest > number ){
			Smallest = number;
			}
			else{
			Largest = number;
			}
		count ++;
		}

	System.out.printf("The Largest Number is: %d%n", Largest);
	System.out.printf("The Smallest Number is: %d%n", Smallest);
	}
}