import java.util.Scanner;
	public class PrimeNumber{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

		System.out.println("Application to check if a Number is a Prime Number or Not!");
		System.out.print("Enter Number To Check if it is a Prime Number: ");
		int userinput = input.nextInt();

			if (userinput < 2 )
			System.out.printf("%d is not a Prime Number!", userinput);

			if(userinput == 2 || userinput == 3 || userinput % 2 == 1)
			System.out.printf("%d is a Prime Number!", userinput);

			if(userinput > 2 && userinput % 2 == 0)
			System.out.printf("%d is not a Prime Number!", userinput);

			if(userinput / 2 < 0  || Math.sqrt(userinput) <  0)
			System.out.printf("%d is a Prime Number!", userinput);

			if(userinput / 3 < 0 || userinput / 5 < 0)
			System.out.printf("%d is a Prime Number!", userinput);
	}
}