import java.util.Scanner;
	public class ReadNumbers{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

				System.out.print("Enter the Number you want to Compare: ");
				int numcount = input.nextInt();

					int count = 0;
					int total = 0;

			System.out.printf("Enter the numbers to sum below: %n");
			
			while (total < numcount){
				int numcount2 = input.nextInt();

				total = total + numcount2;

			if(total < numcount){
				System.out.printf("The sum of the numbers is %d , and it's not equal to %d%n", total, numcount);
				System.out.print("Enter the next number to sum below: ");
				}
			count = count + 1;
			}

		System.out.printf("The Sum of the numbers entered is %d, Compared to %d%n", total, numcount);
		
	}
}