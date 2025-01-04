package assignment;

public class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void resizeWidth(int width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width resized to: " + this.width);
        } else {
            System.out.println("Invalid width. Width must be greater than 0.");
        }
    }

    @Override
    public void resizeHeight(int height) {
        if (height > 0) {
            this.height = height;
            System.out.println("Height resized to: " + this.height);
        } else {
            System.out.println("Invalid height. Height must be greater than 0.");
        }
    }

    public void displayDimensions() {
        System.out.println("Rectangle Dimensions - Width: " + width + ", Height: " + height);
    }
}
