import java.util.Scanner;
	public class NokiaMenu{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

				

			System.out.println("welcome to FABULOUS NOKIA MENU APPLICATION!!! ");

			System.out.println("LIST OF MENU FUNCTIONS");
			System.out.println("PRESS NUMBER TO SELECT OPTION.");
			System.out.printf("1. Phone Book %n2. Messages %n3. Chat %n4. Call Register %n5. Tones%n6. Settings%n7. Call Diverts%n8. Games%n9. Calculator%n10. Reminders%n11. Clock%n12. Profiles%n13. Sim Services %n");
	int menu = input.nextInt();
	switch (menu){
				
	case 1:
			System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
			System.out.println("PHONE BOOK");
			
			System.out.printf("1. Search %n2. Service No.s %n3. Add Name %n4. Erase%n5. Edit%n6. Assign Tone%n7. Send b'card%n8. Options%n9. Speed dials%n10. Voice tags%n");
			System.out.print("press number to select option: ");
			int phonebook = input.nextInt();
			switch (phonebook){
				
				case 1:
				System.out.println("Search");
				break;

				case 2:
				System.out.println("Service no.s");	
				break;
		
  				case 3:
				System.out.println("Add name");
				break;

				case 4:
				System.out.println("Erase");
				break;

				case 5:
				System.out.println("Edit");
				break;

				case 6:
				System.out.println("Assign tone");
				break;

				case 7:
				System.out.println("Send b'card");
				break;
				
				case 8:
				
					System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
					System.out.println("PHONE BOOK_Options");
			
					System.out.printf("1. Type of view %n2. Memory status %n");
					System.out.print("press number to select option: ");
					int Options = input.nextInt();
						switch (Options){
				
							case 1:
							System.out.println("Type of view");
							break;

							case 2:
							System.out.println("Memory status");	
							break;

							default:
							System.out.println("Invalid Input");

						}	
				break;
		
  				case 9:
				System.out.println("Speed dials");
				break;

				case 10:
				System.out.println("Voice tags");
				break;

				default:
				System.out.println("Invalid Input");


			}

				

	break;

	case 2:
			System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
			System.out.println("MESSAGES");
			
			System.out.printf("1. Write messages %n2. Inbox %n3. Outbox %n4. Picture messages%n5. Templpates %n6. Smileys%n7. Messages settings%n8. Info service%n9. Voice mailbox number%n10. Service Command Editor%n");
			System.out.print("press number to select option: ");
			int message = input.nextInt();
			switch (message){
				
				case 1:
				System.out.println("Write messages");
				break;

				case 2:
				System.out.println("Inbox");	
				break;
		
  				case 3:
				System.out.println(" Outbox");
				break;

				case 4:
				System.out.println("Picture messages");
				break;

				case 5:
				System.out.println("Templpates");
				break;

				case 6:
				System.out.println("Smileys");
				break;
				
				case 7:
				
					System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
					System.out.println("MESSAGES_Message-settings");
			
					System.out.printf("1. Set %n2. Common %n99. go back%n");
					System.out.print("press number to select option: ");
					int messageSettings = input.nextInt();
						switch (messageSettings){
				
							case 1:
								System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
								System.out.println("MESSAGES_Message-settings_Set ");
			
								System.out.printf("1. Message centre number %n2. Messages sent as %n3. Message validity%n99. go back%n");
								System.out.print("press number to select option: ");
								int set = input.nextInt();
								switch (set){
				
									case 1:
									System.out.println("Message centre number");
									break;

									case 2:
									System.out.println("Messages sent as");	
									break;

									case 3:
									System.out.println("Message validity");	
									break;

									default:
									System.out.println("Invalid Input");

								}	

							break;

							case 2:
								System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
								System.out.println("MESSAGES_Message-settings_Common ");
			
								System.out.printf("1. Delivery reports %n2. Reply via same centre %n3. Character support%n99. go back%n");
								System.out.print("press number to select option: ");
								int common = input.nextInt();
								switch (common){
				
									case 1:
									System.out.println("Delivery reports");
									break;

									case 2:
									System.out.println("Reply via same centre");	
									break;

									case 3:
									System.out.println("Character support");	
									break;

									default:
									System.out.println("Invalid Input");

								}	
	
							break;

							case 99:
							if(messageSettings == 99)
							switch(message){case 7:}	
							break;

							default:
							System.out.println("Invalid Input");

						}	
				break;

				case 8:
				System.out.println("Info service");
				break;
		
  				case 9:
				System.out.println("Voice mailbox number");
				break;

				case 10:
				System.out.println("Service Command Editor");
				break;

				default:
				System.out.println("Invalid Input");


				}
			
	break;
		
  	case 3:
	System.out.println("Chat");
	break;

	case 4:	
			System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
			System.out.println("CALL REGISTER");	
			System.out.printf("1. Missed calls %n2. Received calls %n3. Dialed numbers %n4. Erase recent call lists %n5. Show call duration %n6. Show call costs %n7. Call cost settings %n8. Prepaid credit%n99. go back%n");
			System.out.print("press number to select option: ");
			int callRegister = input.nextInt();
				switch(callRegister) {
					case 1:
					System.out.println("Missed calls");
					break;

					case 2:
					System.out.println("Received calls");
					break;
		
					case 3:
					System.out.println("Dialed numbers");
					break;

					case 4:
					System.out.println("Erase recent call lists");
					break;

					case 5:
					System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
					System.out.println("CALL REGISTER_Show call duration");	
					System.out.printf("1. Last call duration  %n2. All calls duration %n3. Received calls duration %n4. Dialled calls duration %n5. Clear timers%n99. go back%n");
					System.out.println("Press number to select option: ");
					int showCallDuration = input.nextInt();

						switch(showCallDuration){
							case 1:
							System.out.println("Last call duration");
							break;

							case 2:
							System.out.println("All calls duration");
							break;
		
							case 3:
							System.out.println("Received calls duration");
							break;

							case 4:
							System.out.println("Dialled calls duration");
							break;

							case 5:
							System.out.println("Clear timers");
							break;

							case 99:
							System.out.println("go back");
							break;

							default:
							System.out.print("Invalid input");
							}
					break;

					case 6:
					System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
					System.out.println("CALL REGISTER_Show call costs");	
					System.out.println("1.Last call cost %n2. All calls cost %n3.Clear counters%n99. go back%n");
					System.out.println("Press number to select option: ");
					int showCallCost = input.nextInt();
						switch(showCallCost){
							case 1:
							System.out.println("Last call cost");
							break;

							case 2:
							System.out.println("All calls cost");
							break;
		
							case 3:
							System.out.println("Clear counters");
							break;

							case 99:
							System.out.println("go back");
							break;

							default:
							System.out.print("Invalid input");
							}

					break;

			
					case 7:
					System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
					System.out.println("CALL REGISTER_Call cost settings");	
					System.out.printf("1.Last call cost %n2. All calls cost %n3.Clear counters%n99. go back%n");
					System.out.println("Press number to select option: ");
					int callCallCost = input.nextInt();

						switch(callCallCost){
							case 1:
							System.out.println("Call cost limit");
							break;

							case 2:
							System.out.println("Show costs in");
							break;
		
							case 99:
							System.out.println("go back");
							break;

							default:
							System.out.print("Invalid input");
							}


				}

	break;

	case 5:
			System.out.println("Tones");
			System.out.println("1. Ringing tone %n2. Ringing volume %n3. Incoming call alert %n4. Composure %n5. Message alert tone %n6. Keypad tones %n7. Warning and game tones %n8. Vibrating alert %n9. Screen saver %n99. go back");
			System.out.println("Press any number to select option: ");
			int Tones = input.nextInt();
			switch (Tones){

			case 1:
			System.out.println("Ringing tone");
			break;
		
			case 2:
			System.out.println("Ringing volume");
			break;
		
			case 3:
			System.out.println("Incoming call alert");
			break;

			case 4:
			System.out.println("Composure");
			break;

			case 5:
			System.out.println("Message alert tone");
			break;

			case 6:
			System.out.println("Keypad tones");
			break;

			case 7:
			System.out.println("Warning and game tones");
			break;

			case 8:
			System.out.println("Vibrating alert");
			break;

			case 9:
			System.out.println("Screen saver");
			break;

			case 99:
			System.out.println("go back");
			break;

			default:
			System.out.print("invalid input");

			}

	break;

	case 6:
			System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
			System.out.println("SETTINGS");	
			System.out.printf("1. Call settings %n2. Phone settings %n3. Security settings %n4. Restore Factory%n99. go back%n");
			System.out.print("press number to select option: ");
			int settings = input.nextInt();

			switch (settings){
					case 1:
					System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
					System.out.println("SETTINGS_Call settings");
					System.out.printf("1. Automatic redial %n2. Speed dialing %n3. Call waiting options %n4. Own number sending %n5. Phone line in use %n6. Automatic answer%n99. go back");
					System.out.println("Press any number to select option: ");
					int callSettings = input.nextInt();
						switch (callSettings){
							case 1:
							System.out.println("Automatic redial");
							break;
		
							case 2:
							System.out.println("Speed dialling");
							break;
		
							case 3:
							System.out.println("Call waiting options");
							break;

							case 4:
							System.out.println("Own number sending");
							break;

							case 5:
							System.out.println("Phone line in use");
							break;

							case 6:
							System.out.println("Automatic answer");
							break;

							case 99:
							System.out.println("go back");
							break;

							default:
							System.out.print("invalid input");

							}

					break;

					case 2:
					System.out.println("Phone settings");
					System.out.printf("1. Language %n2. Cell info display %n3. Welcome note %n4. Network selection %n5. lights %n6. Confirm SIM service actions%n99. go back");
					System.out.println("Press any number to select option: ");
					int phoneSettings = input.nextInt();
						switch (phoneSettings){
							case 1:
							System.out.println("Language");
							break;
		
							case 2:
							System.out.println("Cell info display");
							break;
		
							case 3:
							System.out.println("welcome note");
							break;

							case 4:
							System.out.println("Network selection");
							break;

							case 5:
							System.out.println("lights");
							break;

							case 6:
							System.out.println("Confirm SIM service actions");
							break;

							case 99:
							System.out.println("go back");
							break;

							default:
							System.out.print("invalid input");

							}


					break;
		
					case 3:
					System.out.println("Security settings");
					System.out.println("1. PIN code request \n 2.Call barring service \n 3.Fixed dialling \n 4.Closed user group \n 5.Phone security \n 6. Change access codes");
					System.out.println("Press any number to select option: ");
					int securitySettings = input.nextInt();
						switch (securitySettings){
							case 1:
							System.out.println("PIN code request");
							break;
		
							case 2:
							System.out.println("Call barring service");
							break;
		
							case 3:
							System.out.println("Fixed dialling");
							break;

							case 4:
							System.out.println("Closed user group");
							break;

							case 5:
							System.out.println("Phone security");
							break;

							case 6:
							System.out.println("Change access codes");
							break;

							case 99:
							System.out.println("go back");
							break;

							default:
							System.out.print("invalid input");

							}

					break;

					case 4:
					System.out.println("Restore factory settings");
					break;

					case 99:
					System.out.println("go back");
					break;

					default:
					System.out.print("Invalid input");
				}


		break;


	case 7:
	System.out.println("Call Divert");
	break;

	case 8:
	System.out.println("Games");			
	break;
		
  	case 9:
	System.out.println("Calculator");
	break;

	case 10:
	System.out.println("Reminders");
	break;

	case 11:
			System.out.println("FABULOUS NOKIA MENU APPLICATION!!! ");
			System.out.println("CLOCK");	
			System.out.printf("1. Alarm clock %n2. Clock settings %n3. Date setting %n4. Stopwatch %n5. Countdown timer %n6. Auto update of date and time%n99. go back%n");
			System.out.print("press number to select option: ");
			int clock = input.nextInt();

			switch (clock){
				case 1:
				System.out.println("Alarm clock");
				break;
		
				case 2:
				System.out.println("Clock settings");
				break;
		
				case 3:
				System.out.println("Date setting");
				break;

				case 4:
				System.out.println("Stopwatch");
				break;

				case 5:
				System.out.println("Countdown timer");
				break;

				case 6:
				System.out.println("Auto update of date and time");
				break;

				case 99:
				System.out.println("go back");
				break;

				default:
				System.out.print("invalid input");

							}
	

	break;

	case 12:
	System.out.println("Profiles");
	break;

	case 13:
	System.out.println("Sim services");
	break;

	default:
	System.out.println("Invalid Input");


		}



	}
}