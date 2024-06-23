import java.util.Scanner;
	public class SumofNaturalNumbers{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

		System.out.println("Application to Calculate the Sum of 10 Natural Numbers!!!");
		System.out.println("Enter 10 digits below: ");
			int sum = 0;
			
		for(int i = 1; i <= 10; i++){
			int digits = input.nextInt();
			sum = sum + digits;
		}		

		System.out.printf("The Sum of the 10 digits entered is: %d", sum);
	}
}