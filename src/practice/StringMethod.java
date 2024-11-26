package practice;

public class StringMethod {
	 public static void main(String[] args) {
		  
		  // String = a reference data type that can store one or more characters
		  //   reference data types have access to useful methods
		  
		  String name = "Bro";
		  
		  boolean result = name.equalsIgnoreCase("bro");
		  int result1 = name.length();
		  char result2 = name.charAt(0);
		  int result3 = name.indexOf("o");
		  boolean result4 = name.isEmpty();
		  String result5 = name.toUpperCase();
		  String result6 = name.toLowerCase();
		  String result7 = name.trim();
		  String result8 = name.replace('o', 'a');
		   
		  System.out.println(result);
		  System.out.println(result1);
		  System.out.println(result2);
		  System.out.println(result3);
		  System.out.println(result4);
		  System.out.println(result5);
		  System.out.println(result6);
		  System.out.println(result7);
		  System.out.println(result8);
		  
		// wrapper class = 	provides a way to use primitive data types as reference data types
			//					reference data types contain useful methods
			//					can be used with collections (ex.ArrayList)
			
			//primitive		//wrapper
			//---------		        //-------
			// boolean		Boolean
			// char			Character
			// int			Integer
			// double		Double
			
			// autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
			// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
			
//			Boolean a = true;
//			Character b = '@';
//			Integer c = 123;
//			Double d = 3.14;
		 }
}
