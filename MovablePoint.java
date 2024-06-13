
 //Creating MovablePoint class that extends the Point class with speed attributes
public class MovablePoint extends Point {
    // Private instance variables for xSpeed and ySpeed
    private float xSpeed;
    private float ySpeed;

    // Defining default constructor initializing x, y, xSpeed, and ySpeed to 0.0f
    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    // Defining parameterized constructor to initialize x, y, xSpeed, and ySpeed with given values
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Call the constructor of the superclass Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter method for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter method for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter method for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter method for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Method to update the x and y  coordinates
    public void move() {
        setX(getX() + xSpeed); 
        setY(getY() + ySpeed); 
    }

    // Overridden toString method to return a string representation of the movable point
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }
}


