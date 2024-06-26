//Created Subclass Circle
public class Circle extends Shape {
    // Instance variable
    private double radius;

    // No-argument constructor
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Constructor with radius parameter
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor with radius, color, and filled parameters
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //This Circle Class override toString method from the Shape Class 
    //Providing refined string representation for Circle objects
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}


