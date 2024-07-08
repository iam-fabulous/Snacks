import java.util.Scanner;
	public class StudentGrade{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.print("How many Students do you have?...");
			int numberOfStudents = input.nextInt();

			System.out.print("How many Subjects do they offer?...");
			int numberOfSubjects = input.nextInt();

			System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved Successfully!");
			
			int[][] gradesArray = new int[numberOfStudents][numberOfSubjects];

		for(int student = 1; student < numberOfStudents; student++){

			for(int score = 1; score < numberOfSubjects; score++){

			System.out.printf("Entering Score of Student ..%d%n", student);
			System.out.printf("Enter Score for Subject ...%d%n",score);

				 gradesArray[student][score] = input.nextInt();

			System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved Successfully!");

			}
		}

	}
}