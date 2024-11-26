package practice;
import java.util.Scanner;  // Import the Scanner class

public class Main {

	public static void main(String[] args) {
//		user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello! " + name);
        scanner.close();
	}
}