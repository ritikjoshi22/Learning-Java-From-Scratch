package practice;

public class Array {
	public static void main(String[] args) {
		// array = used to store multiple values within a single variable
		//String[] cars = {"Camaro", "Corvette", "Tesla"};
				String[] cars = new String[3];
				
				cars[0] = "Camaro";
				cars[1] = "Corvette";
				cars[2] = "Tesla";
					
				for(int i=0; i<cars.length; i++) {
					System.out.println(cars[i]);
				}
				
				// 2D array = an array of arrays
				
				String[][] cars2 = 	{	
										{"Camaro","Corvette","Silverado"},
										{"Mustang","Ranger","F-150"},
										{"Ferrari","Lambo","Tesla"}
									};
				
				/*
				cars[0][0] = "Camaro";
				cars[0][1] = "Corvette";
				cars[0][2] = "Silverado";
				cars[1][0] = "Mustang";
				cars[1][1] = "Ranger";
				cars[1][2] = "F-150";
				cars[2][0] = "Ferrari";
				cars[2][1] = "Lambo";
				cars[2][2] = "Tesla";
				*/
				
				for(int i=0; i<cars.length; i++) {
					System.out.println();
					for(int j=0; j<cars2[i].length; j++) {
						System.out.print(cars2[i][j]+" ");
					}
				}
	}
}
