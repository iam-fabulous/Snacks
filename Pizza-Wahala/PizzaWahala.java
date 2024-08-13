import java.util.InputMismatchException;
import java.util.Scanner;
public class PizzaWahala{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int numberOfPacks = 0;
		int constPrize = 0;
		int remainder = 0;
		int temp1 = 0;
		int temp = 0;
		int price = 0;
		int pizzaType = -1;
		int numberOfPeople = 0;
		boolean flag = false;
		System.out.println("		Welcome to PIZZA WAHALA Hub!!!");
		System.out.println("We handle all your wahala(s)!, Please Place Your Order!");
		System.out.print("Enter number of people your order is for: ");
		while (!flag) {
			numberOfPeople = input.nextInt();
            		if(numberOfPeople > 0){
               		 	
				
               		 	flag = true; 
            		} else  {
				System.out.println("Invalid input. Please enter valid number: ");
                		
                		
            		}
		}

		while (pizzaType != 0) {
			System.out.println("Availabele Pizza Sizes!!!");
			System.out.println("	1- Sapa size ----- $2,000 per box");
			System.out.println("	2- Small money ----- $2,400 per box");
			System.out.println("	3- Big boys ----- $3,000 per box");
			System.out.println("	4- Odogwu ----- $4,200 per box");
			System.out.println("	0- to Exit");
			System.out.println("Enter number to place order!");
            		pizzaType = input.nextInt();
				switch(pizzaType){

					case 1: System.out.println("You chose the Sapa Pizza Box with(4 Slices only!)\nPrice Per Box is $2000");
						int sapaCosnt = 4; constPrize = 2000;
						temp1 = numberOfPeople + sapaCosnt;
						numberOfPacks = temp1 / sapaCosnt;
						temp = numberOfPacks * sapaCosnt;
						remainder = temp - numberOfPeople;
						System.out.println("Number of box Pizza's' to buy: "+ numberOfPacks);
						System.out.println("After Serving: " + numberOfPeople + " slices, You should have "+remainder + " Slices remaining.");

						for(int row = 0; row < numberOfPacks; row++){
							price += constPrize;
						}
						System.out.println("The Total price for " + numberOfPacks + " is: $"+ price);
						System.out.println("Do you want to place another Order, 1 for 'yes' and 0 for 'no'.");
            					pizzaType = input.nextInt();
					break;
					case 2: System.out.println("You chose the Small Money Box with(6 Slices only!)\nPrice Per Box is $2400");
						int smallMoneyCosnt = 6; constPrize = 2400;
						temp1 = numberOfPeople + smallMoneyCosnt;
						numberOfPacks  = temp1 / smallMoneyCosnt;
						temp = numberOfPacks * smallMoneyCosnt;
						remainder = temp - numberOfPeople;
						System.out.println("Number of box Pizza's' to buy: "+ numberOfPacks);
						System.out.println("After Serving: " + numberOfPeople + " slices, You should have "+remainder + " Slices remaining.");

						for(int row = 0; row < numberOfPacks; row++){
							price += constPrize;
						}
						System.out.println("The Total price for " + numberOfPacks + " is: $"+ price);
						System.out.println("Do you want to place another Order, 1 for 'yes' and 0 for 'no'.");
            					pizzaType = input.nextInt();
					break;
					case 3: System.out.println("You chose the Big boys Box with(8 Slices only!)\nPrice Per Box is $2000");
						int bigBoysCosnt = 8; constPrize = 3000;
						temp1 = numberOfPeople + bigBoysCosnt;
						numberOfPacks  = temp1 / bigBoysCosnt;
						temp = numberOfPacks * bigBoysCosnt;
						remainder = temp - numberOfPeople;
						System.out.println("Number of box Pizza's' to buy: "+ numberOfPacks);
						System.out.println("After Serving: " + numberOfPeople + " slices, You should have "+remainder + " Slices remaining.");

						for(int row = 0; row < numberOfPacks; row++){
							price += constPrize;
						}
						System.out.println("The Total price for " + numberOfPacks + " is: $"+ price);
						System.out.println("Do you want to place another Order, 1 for 'yes' and 0 for 'no'.");
            					pizzaType = input.nextInt();
					break;
					case 4: System.out.println("You chose the Odogwu Box with(12 Slices only!)\nPrice Per Box is $2000");
						int odogwuCosnt = 12; constPrize = 4200;
						temp1 = numberOfPeople + odogwuCosnt;
						numberOfPacks  = temp1 / odogwuCosnt;
						temp = numberOfPacks * odogwuCosnt;
						remainder = temp - numberOfPeople;
						System.out.println("Number of box Pizza's' to buy: "+ numberOfPacks);
						System.out.println("After Serving: " + numberOfPeople + " slices, You should have "+remainder + " Slices remaining.");

						for(int row = 0; row < numberOfPacks; row++){
							price += constPrize;
						}
						System.out.println("The Total price for " + numberOfPacks + " is: $"+ price);
						System.out.println("Do you want to place another Order, 1 for 'yes' and 0 for 'no'.");
            					pizzaType = input.nextInt();
					break;
					default:
						System.out.println("Do you want to place another Order, 1 for 'yes' and 0 for 'no'.");
            					pizzaType = input.nextInt();
				
				}
           
		}
	}
}