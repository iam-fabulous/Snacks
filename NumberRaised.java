import java.util.Scanner;
	public class NumberRaised{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

		System.out.println("Application to find the value of one number raised to the power of another!!!");

			System.out.print("Enter the Base Number: ");
			int base = input.nextInt();
			
			System.out.print("Enter the Power Number: ");
			int power = input.nextInt();

			float result = base * 1;
		for(int i = power; i <= power; i++){
			result = result * base;
		}
		
		System.out.printf("The number %d raised to the power of %d is: %.0f", base, power, result);
	}
}