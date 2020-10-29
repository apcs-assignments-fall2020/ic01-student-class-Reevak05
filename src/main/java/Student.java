public class Student extends Person {
    private String firstName;
    private String lastName;
    private String classYear;

    public Student(String firstName, String lastName, String classYear) {
        //this.firstName = firstName;
        //this.lastName = lastName;
        super(firstName, lastName);
        this.classYear = classYear;
    }

    public String getClassYear() {
        return this.classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;

    }

    public String toString() {
        //return this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear();
        return super.toString() + ", " + this.getClassYear();
    }
}