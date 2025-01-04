package assignment;

public class Test {
	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(10, 20);

	        System.out.println("Starting Dimensions:");
	        rectangle.displayDimensions();

	        System.out.println("\nResizing...");
	        rectangle.resizeWidth(30);
	        rectangle.resizeHeight(40);

	        // Display updated dimensions
	        System.out.println("\nUpdated Dimensions:");
	        rectangle.displayDimensions();
	    }
}
