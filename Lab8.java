import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab8 {
	


	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		
		int userInput = 0;
		//Parallel arrays here, 3 categories
		String[] students = {"Darby","Louis","Sharde","Kari","Stan","Lauren","Cameron","Amna","Kris","Jasmine"};
		String[] favFood = {"Coffee","Cheetos","Ice Cream","Banana's","tofu","Sushi","Pasta","Garlic Bread","Chicken Legs","Alfredo"};
		String[] homeTown = {"College Station","Cincinatti","Detroit","Southfield","Toledo","Ann Arbor","Royal Oak","Los Angeles","Dexter","Cheescake"};
				
		System.out.println("Welcome to our Java class. ");

		// this catches all the incorrect input
		userInput = getInt(scnr, "Which student would you like to learn more about? (enter a number 1-10)" , 1, 10);
		
		//starts the do while loop
		String answer = "y";
		do {
		System.out.println("Student " + userInput + " is " + students[userInput-1] + ". What would you like to know about "  
				+ students[userInput-1] + "? (enter \"hometown\" or \"favorite food\")");
		
		String  wantToKnow = scnr.nextLine();
		
		if (wantToKnow.equals("favorite food")) {
			System.out.println(students[userInput-1] + "'s favorite food is " + favFood[userInput-1]);
		}
		if (wantToKnow.equals("hometown")) {
				System.out.println(students[userInput-1] + "'s hometown is " + homeTown[userInput-1]);
		}
		else {
		}
			
		System.out.println("Would you like to learn more? (y/n)"); //conditional\r\n"
			answer = scnr.next();
			
		} while (answer.trim().toLowerCase().startsWith("y")); //while loop
	}
	
	
	public static int getInt(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		try {
			int num = scnr.nextInt();
			scnr.nextLine();
			return num;
		} catch (InputMismatchException e) {
			System.out.println("Enter a whole number, using digits.");
			scnr.nextLine();
			return getInt(scnr, prompt);
		}
	}
	
	
	public static int getInt(Scanner scnr, String prompt, int min, int max) {
		boolean isValid = false;
		int number;
		do {
			number = getInt(scnr, prompt);
					
			if (number < min) {
				isValid = false;
					System.out.println("The number must be at least " + min);
			} else if (number > max) {
				isValid = false;
					System.out.println("The number must not be larger than " + max);
			} else {
				isValid = true;
			}
					
			} while (!isValid);
			return number;
			
	}
}

	//add this later Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
	
