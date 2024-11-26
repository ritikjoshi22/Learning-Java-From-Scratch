package practice;
import java.util.Scanner;  // Import the Scanner class

public class ConditionalStatements {
	public static void main(String[] args) {
		// if statement = performs a block of code if it's condition evaluates to be true
		
				int age = 75;
				
				if(age==75) {
					System.out.println("Ok Boomer!");
				}
				else if(age>=18) {
					System.out.println("You are an adult!");
				}
				else if(age>=13) {
					System.out.println("You are a teenager!");
				}
				else {
					System.out.println("You are not an adult!");
				}
				
				
				// switch = statement that allows a variable to be tested for equality against a list of values
				String day = "Friday";
				
				switch(day) {
					case "Sunday": System.out.println("It is Sunday!");
					break;
					case "Monday": System.out.println("It is Monday!");
					break;
					case "Tuesday": System.out.println("It is Tuesday!");
					break;
					case "Wednesday": System.out.println("It is Wednesday!");
					break;
					case "Thursday": System.out.println("It is Thursday!");
					break;
					case "Friday": System.out.println("It is Friday!");
					break;
					case "Saturday": System.out.println("It is Saturday!");
					break;
					default: System.out.println("That is not a day!");
				}
				
				// logical operators = used to connect two or more expressions
				//
				//						&& = (AND) both conditions must be true
				// 						|| = (OR) either condition must be true
				//						! = (NOT) reverses boolean value of condition

		// -------------------------------- Example 1 --------------------------------
				int temp = 15;
				
				if(temp>30) {
					System.out.println("It is hot outside");
				}
				else if(temp>=20 && temp<=30) {
					System.out.println("It is warm outside");
				}
				else {
					System.out.println("It is cold outside");
				}

		// -------------------------------- Example 2 --------------------------------
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("You are playing a game! Press q or Q to quit");
				String response = scanner.next();
				
				if(!response.equals("q") && !response.equals("Q")) {
					System.out.println("YOu are still playing the game *pew pew*");
				}
				else {
					System.out.println("You quit the game");
				}
				scanner.close();
	}
}
