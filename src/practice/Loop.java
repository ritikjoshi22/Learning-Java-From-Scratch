package practice;
import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList;
public class Loop {
	public static void main(String[] args) {
		// while loop = executes a block of code as long as a it's condition remains true

				Scanner scanner = new Scanner(System.in);
				String name = "";
				
				while(name.isBlank()) {
					System.out.print("Enter your name: ");
					name = scanner.nextLine();
				}
				System.out.println("Welcome "+name);
				
				// for loop = executes a block of code a limited amount of times
				
				for(int i=10; i>=0; i--) {
					System.out.println(i);
				}
				System.out.println("Happy new year!");
				
				// nested loops = a loop inside of a loop
				
				int rows;
				int columns;
				String symbol = "";
				
				System.out.println("Enter # of rows: ");
				rows = scanner.nextInt();
				System.out.println("Enter # of columns: ");
				columns = scanner.nextInt();
				System.out.println("Enter symbol to use: ");
				symbol = scanner.next();
				
				for(int i=1; i<=rows; i++) {
					System.out.println();
					for(int j=1; j<=columns;j++) {
						System.out.print(symbol);
					}
				}
				
				// for-each = 	traversing technique to iterate through the elements in an array/collection
				//				less steps, more readable
				//				less flexible
				
				//String[] animals = {"cat","dog","rat","bird"};
				ArrayList<String> animals = new ArrayList<String>();
				
				animals.add("cat");
				animals.add("dog");
				animals.add("rat");
				animals.add("bird");
				
				for(String i : animals) {
					System.out.println(i);
				}
				scanner.close();
	}
}
