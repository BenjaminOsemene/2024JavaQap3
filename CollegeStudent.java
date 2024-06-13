//Created CollegeStudent Class with instance variables year and major
//The year and major instance variables are private to ensure that they are only accessible and 
//Modifiable through the class methods such as getYear, getMajor, setYear and setMajor.
class CollegeStudent extends Student {
    private int year; // current level in college (e.g., FROSH = 1, SOPH = 2, ...)
    private String major; // e.g. "Electrical Engineering", "Communications", "Undeclared"

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        // using the super class' constructor
        super(name, age, gender, idNum, gpa);

        // initializing CollegeStudent-specific variables
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    //toString() method
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}   

