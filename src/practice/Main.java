package practice;
import java.util.Scanner;  // Import the Scanner class

public class Main {

	public static void main(String[] args) {
//		user input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//        System.out.println("Hello! " + name);
//        scanner.close();
        
        //Object Passing
        Cars car = new Cars("BMW");
        Garage garage = new Garage();
        garage.park(car);
        
        
     // static = modifier. A single copy of a variable/method is created and shared.
     		//			The class "owns" the static member
     		
     		Friend friend1 = new Friend("Sponegbob");
     		Friend friend2 = new Friend("Patrick");
     		Friend friend3 = new Friend("Patrick");
     		
     		Friend.displayFriends();
     		
     		//Super keyword implementation
     		Hero hero = new Hero("Batman", 42, "I am rich");
     		System.out.println(hero);
	}
}