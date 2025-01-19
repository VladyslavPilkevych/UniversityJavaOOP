public class Student extends Person
{
    private String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Student ID: " + studentID;
    }

}
