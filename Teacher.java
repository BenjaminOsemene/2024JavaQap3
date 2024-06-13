//Created the Teacher Class with instance variables
//The subject and salary instance variables are private to ensure that they are only accessible and 
//Modifiable through the class methods such as geSubject, getSalary, setSubject and setSalary.
class Teacher extends Person {
    private String subject; // e.g. "Computer Science", "Chemistry", "English", "Other"
    private double salary; // the teacher's annual salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        // using the super class' constructor
        super(name, age, gender);

        // initializing Teacher-specific variables
        this.subject = subject;
        this.salary = salary;
    }

    // Getter methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // tostring() method
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }
}
    

