package Lab1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// Displays a welcome message
		System.out.println("Welcome to Grand Circus' Room Detail generator!");
System.out.println();

Scanner sc = new Scanner(System.in);
String choice = "y";
while (choice.equalsIgnoreCase("y")) {
	//Get input from user
	System.out.println("Enter Length: ");
	Double length = Double.parseDouble (sc.nextLine());
	
	System.out.println("Enter Width: ");
	Double width = Double.parseDouble(sc.nextLine());
	
	//calculate the area
	double area = 0;
	area = length * width;
	
	//calculate the Perimeter
	double Perimeter = 0;
	Perimeter = (2 *(length + width));
	
	//format and display results
	System.out.println("Area: " + area);
	System.out.println("Perimeter: " + Perimeter);
	System.out.println();
	
	//see if user wants to continue
	System.out.println("Continue? (y/n): ");
	choice = sc.nextLine();
	System.out.println();
			
}
sc.close();
System.out.println("Bye!");
	}

}
