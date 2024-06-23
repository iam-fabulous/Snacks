import java.util.Scanner;
	public class SumofIntegers{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

		System.out.println("Application to Sum two Integer Numbers!!!");

				int yes = 0;
			do{
			System.out.print("Enter First Number: ");
			int num1 = input.nextInt();

			System.out.print("Enter Second Number: ");
			int num2 = input.nextInt();
			
				int sum = num1 + num2;

			System.out.printf("The Sum of the Numbers is: %d%n%n", sum);
			System.out.println("Do You Wish To Perform Another Operation?");
			System.out.printf("Enter 1 for YES and 0 for NO... %n");
			yes = input.nextInt();
			}while (yes == 1);
	}
}