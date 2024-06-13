public class Square extends Rectangle {
    // Constructor with no argument
    public Square() {
        super();
    }

    // Constructor with parameter side
    public Square(double side) {
        super(side, side);
    }

    // Constructor with side, color, and filled parameters
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter for side which is equal as width
    public double getSide() {
        return getWidth();
    }

    // Setter for side which sets both width and length
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // The Square Class overriding the  setWidth method from Rectangle Class ensuring that it maintains a square
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // The Square Class overriding setLength method from Rectangle Class  to ensure it is  a square
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    //The Square Class Overrides  toString method from Rectangle Class 
    //Refined string square representation
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
