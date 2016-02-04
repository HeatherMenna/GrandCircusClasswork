package Lab3;
import java.util.Scanner;
import java.lang.String; 
public class Lab3Adventure {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan1 = new Scanner(System.in);

// allows user to input name
System.out.println("Welcome! What is your name? (enter your name): ");

//stores user input as Name in Upper case
String Name = scan1.nextLine().toUpperCase();
if (Name.equals("HARRY"))
	System.out.println("You're a wizard, Harry!");

// allows user to either play or end game
System.out.println("Would you like to play a game? (enter yes or no): ");
String Choice = scan1.nextLine().toLowerCase(); //.toLowerCase() converts string to so no matter what is entered, the cases match

// user has selected yes to play the game
switch(Choice) {
case "yes": 
// allows user to input an adjective to be used later
	System.out.println("Please enter an adjective: ");
	String Adjective = scan1.nextLine().toLowerCase();

// allows user to enter an action to be used later
	System.out.println("Enter an action: ");
	String Action = scan1.nextLine().toLowerCase(); 
	
// user can select to face the beast or run away
	System.out.println("Excellent! You are walking across a field and you encounter a fire-breathing dragon! What do you do? (enter face the beast or run away): ");
		String Choice2 = scan1.nextLine().toLowerCase();
		
// user selects to face the beast
			switch(Choice2) {
			case "face the beast": 
				System.out.println("You approach the dragon. You See that it has __ heads. (enter 1, 2, or 3): ");
			String heads = scan1.nextLine();
	
// user selects how many heads the dragon has
				switch(heads) {
				case "1":
					System.out.println("1-headed dragons are afraid of humans. It sees you and flies away. Game over!");
					break;
				case "2":
					System.out.println("2-headed dragons are terrible creatures. You are eaten. Game over!");
					break;
				case "3":
					System.out.println("No one has ever faced a 3-headed dragon before! Choose your weapon. (enter slingshot, sword, bow and arrow, or any other weapon): ");
				String weapon = scan1.nextLine().toLowerCase();
				
// user selects the weapon 
				switch(weapon) {
					case "bow and arrow": 
					System.out.println("Armed with your bow and arrow, you approach the dragon. You can feel it's fiery breath as you get closer. It stares at you with its __ eyes. (enter red, blue, or any color): ");
						String eyes = scan1.nextLine().toLowerCase();
						
// user selects dragon's eye color
						switch(eyes) {
						case "red":
							System.out.println("Oh thank goodness! Red-eyed dragons are friendly. You pet it and become friends. You name the dragon ________. (enter a name): ");
							String dragonName = scan1.nextLine().toUpperCase();
							System.out.println(Name + " and " + dragonName + " live happily ever after.");
							break;
						case "blue": 
							System.out.println("Oh goodness! Blue-eyed dragons are deadly. Game Over");
							break;
						default: 
							System.out.println("Dragons with " + eyes + " eyes are extremely " + Adjective + "!");
							break;
						}
					break;
					case "slingshot": 
					System.out.println("Armed with your slingshot, you approach the dragon. You can feel its fiery breath as you get closer. You decide to run when you realize you have no rock for the slingshot. Game over");
						break;
					case "sword": 
					System.out.println("Armed with your sword, you approach the dragon. You can feel its fiery breath as you get closer. The sword scrapes along the floor as you walk, and the dragon wakes! You run in fear. Game over ");
						break;
					default:
						System.out.println("Armed with your " + weapon + ", you approach the dragon. You feel its fiery breath as you get closer. The " + weapon + " causes the dragon to " + Action + "!");
							break;
				}
					break;
				default: 
					System.out.println("Dragons with " + heads + " are " + Adjective + "!");
				}
			break; 
			case "run away": 
				System.out.println("Wow! It's a good thing you ran away!");
				break;
			default:
			 System.out.println("Invalid choice.");
			 break;
			}
	
}

// allows user to see the game is over
System.out.println("Game is done.");

// closes the scanner
scan1.close();

// exits the program
return;
}

	}