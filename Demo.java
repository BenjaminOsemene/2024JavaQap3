//This Demo Class tests the usage of the Person, Student, Teacher and CollegeStudent
// By creating instances and printing their sting representations
/*public class Demo {
    public static void main(String[] args) {
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println(ima);
    }
}
*/


//This tests the usage of the Shape, Circle, Rectangle and Square
// By creating instances of each class, and calling their toString, getArea and getPerimeter methods
/*public class Demo {
    public static void main(String[] args) {
        Shape s = new Shape("Red", true);
        Circle c = new Circle(5.0);
        Circle c1 = new Circle(5.0, "blue", true);
        Rectangle r = new Rectangle(2.0, 3.0);
        Rectangle r1 = new Rectangle(2.0, 3.0, "green", false);
        Square sq = new Square(4.0);
        Square sq1 = new Square(4.0, "yellow", true);

        System.out.println(s);
        System.out.println(c);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());

        System.out.println(c1);
        System.out.println("Circle1 area: " + c1.getArea());
        System.out.println("Circle1 perimeter: " + c1.getPerimeter());

        System.out.println(r);
        System.out.println("Rectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());

        System.out.println(r1);
        System.out.println("Rectangle1 area: " + r1.getArea());
        System.out.println("Rectangle1 perimeter: " + r1.getPerimeter());

        System.out.println(sq);
        System.out.println("Square area: " + sq.getArea());
        System.out.println("Square perimeter: " + sq.getPerimeter());

        System.out.println(sq1);
        System.out.println("Square1 area: " + sq1.getArea());
        System.out.println("Square1 perimeter: " + sq1.getPerimeter());
    }
}
*/


// This  Demo class tests the  functionality of Point and MovablePoint classes
public class Demo {
    public static void main(String[] args) {
        // Creating a Point object with coordinates of x and y (1.0, 2.0) and printing the point
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point); 

        // Creating and printing  a MovablePoint before moving with coordinates (1.0, 2.0) and speed (0.5, 1.5)
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint before move: " + movablePoint);

        // Moving the movable point and printing the movable point after moving
        movablePoint.move();
        System.out.println("MovablePoint after move: " + movablePoint); 
    }
}