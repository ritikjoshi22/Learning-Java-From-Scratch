package polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// polymorphism = 	greek word for poly-"many", morph-"form"
				//					The ability of an object to identify as more than one type
				
//				Car car = new Car();
//				Bicycle bicycle = new Bicycle();
//				Boat boat = new Boat();
//				
//				Vehicle[] racers = {car,bicycle,boat};
//				
//				for(Vehicle x : racers) {
//					x.go();
//				}
				
				 //Dynamic Polymorphism
				  
				  Scanner scanner = new Scanner(System.in);
				  Animal animal;
				  
				  System.out.println("What animal do you want?"); 
				  System.out.print("(1=dog) or (2=cat): ");
				  int choice = scanner.nextInt();
				  
				  if(choice==1) {
				   animal = new Dog();
				   animal.speak();
				  }
				  else if(choice==2) {
				   animal = new Cat();
				   animal.speak();
				  }
				  else {
				   animal = new Animal();
				   System.out.println("That choice was invalid");
				   animal.speak();
				  }

	}

}
