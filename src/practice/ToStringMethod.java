package practice;

public class ToStringMethod {
	public static void main(String[] args) {
		  
		  // toString() = special method that all objects inherit, 
		  //    that returns a string that "textually represents" an object.
		  //    can be used both implicitly and explicitly

		  Car car = new Car("Chevrolet","Corvette",2020,"blue",50000.090);
		  
		  
		  System.out.println(car.toString());
		  
		  // or
		  
		  System.out.println(car);

		    
		 }
}
