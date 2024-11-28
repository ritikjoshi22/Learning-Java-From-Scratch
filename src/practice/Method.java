package practice;

public class Method {
	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		int x = 3;
		int y = 4;
		
		int z = add(x,y);

		System.out.println(z);
		
		// overloaded methods = methods that share the same name but have different parameters
				//						method name + parameters = method signature
				
				double result = add(1.0,2.0,3.0,4.0);
				
				System.out.println(result);
				
				
				// printf() = 	an optional method to control, format, and display text to the console window
				//				two arguments = format string + (object/variable/value)
				//				% [flags] [precision] [width] [conversion-character]
						
				boolean myBoolean = true;
				char myChar = '@';
				String myString = "Bro";
				int myInt = 50;
				double myDouble = 1000;
					
				// [conversion-character]
				System.out.printf("%b",myBoolean);
				System.out.printf("%c",myChar);
				System.out.printf("%s",myString);
				System.out.printf("%d",myInt);
				System.out.printf("%f",myDouble);
				
				//[width]
				// minimum number of characters to be written as output
				//System.out.printf("Hello %10s",myString);
				
				//[precision]
				// sets number of digits of precision when outputting floating-point values
				//System.out.printf("You have this much money %.1f",myDouble);
				
				// [flags]
				// adds an effect to output based on the flag added to format specifier
				// - : left-justify
				// + : output a plus ( + ) or minus ( - ) sign for a numeric value
				// 0 : numeric values are zero-padded
				// , : comma grouping separator if numbers > 1000
				
				//System.out.printf("You have this much money %,f",myDouble);
				
				final double PI = 3.14159;
				
				//PI = 4;  //You can't change a final variable
				
				System.out.println(PI);

	}
	
	static int add(int x, int y) {
		
		int z = x + y;
		return z;
		
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}
}
