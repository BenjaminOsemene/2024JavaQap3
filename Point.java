
 // Creating Point class with instance variables
public class Point {
    // Private instance variables for x and y coordinates
    private float x;
    private float y;

    // Defining default constructor initializing x and y to 0.0f
    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    // Defining parameterized constructor to initialize x and y with given values
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for x coordinate
    public float getX() {
        return x;
    }

    // Setter method for x coordinate
    public void setX(float x) {
        this.x = x;
    }

    // Getter method for y coordinate
    public float getY() {
        return y;
    }

    // Setter method for y coordinate
    public void setY(float y) {
        this.y = y;
    }

    // Method to set both x and y coordinates
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Method to get both x and y coordinates as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // Overridden toString method to return a string fiormat of the point
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
 