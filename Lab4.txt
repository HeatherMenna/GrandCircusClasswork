package Lab4;
import java.util.*;

public class Lab4 {

	public static void main(String[] args) {
		// Welcome screen
		System.out.println("Learn your squares and cubes!");
		// call scanner
		Scanner scan1 = new Scanner(System.in);
		
		// variables
		String again ="y";
		int j;

		
    // starts loop
	do {	
		//user inputs an integer
		System.out.println("Enter an integer: ");
		int integer = scan1.nextInt();
		
		// prints out table format
		System.out.println("Number    Squared    Cubed");
		System.out.println("======    =======    =====");
		
		// for loop to determine times through cycle
		for (j=1; j <= integer; j++)
		{
 	    System.out.println(j+ "            " + Math.pow(j, 2)+ "      " + Math.pow(j , 3)) ;
		}
			
	// allows user to decide to run again
	System.out.println("Continue? (y/n): ");
	again = scan1.next();
	
	// loop will run as long as user enters y & ignores case
	} while (again.equalsIgnoreCase("y"));

}
}
