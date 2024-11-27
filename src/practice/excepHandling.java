package practice;

public class excepHandling {
	public static void main(String[] args) {
		int a = 100;
		int b = 10;
		int[] arr = {1,2,3,4,5};
		try {
			int result = a / b;
			System.out.println("Result:"+result);
			System.out.println("Index at 10:"+arr[10]);
		}catch(ArithmeticException e){
			System.out.println("Error: Divide by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Out of bound");
		}catch(Exception e) {
			System.out.println("Unexpected Error");
		}
	}
}
