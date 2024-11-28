package practice;

public class Car extends Vehicle {
	String make;
	String model;
	int year;
	String color;
	double price;
	int wheels = 4;
	int door = 4;
	//we can overload this constructor just like we did with the method overloading
	Car(){
		
	}
	Car(String make, String model, int year, String color, double price){
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
	}
	public String toString() {
		  
		  return make +"\n"+model+"\n"+color+"\n"+year;
		  
		 } 
	
	void drive() {
		System.out.println("You drive the car");
	}
	void brake() {
		System.out.println("You step on the brakes");
	}
	void come() {
		
	}
}
