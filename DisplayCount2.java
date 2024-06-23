import java.util.Scanner;
	public class DisplayCount2{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

				System.out.println("An Application to seperate Positive, Negative, and Zero(s) Numbers!, NOTE!...Enter (-1) to Exit...!");

					int count = 0;
					int positive = 0;
					int negative = 0;
					int zero = 0;

			System.out.println("Enter numbers below: ");
			int numbers = input.nextInt();

			while (numbers != -1){
				System.out.print("Enter next number: ");
				numbers = input.nextInt();

				if(numbers > 0)
				positive = positive + 1;

				if(numbers < 0)
				negative = negative + 1;

				if(numbers == 0)
				zero = zero + 1;

			count = count + 1;
			}

		System.out.printf("You entered a total of %d Positive numbers!%n", positive);
		System.out.printf("You entered a total of %d Negative numbers!%n", negative);
		System.out.printf("You entered a total of %d Zeros!", zero);
	}
}