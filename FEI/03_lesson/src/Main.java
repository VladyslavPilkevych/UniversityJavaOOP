public class Main {
    public static void main(String[] args) {
        Student student = new Student("Qwem1oi1093", "David", "Anderson", 23);
        Employee employee = new Employee("Joe", "Johnson", 35);

        System.out.println(student.getInfo());

        System.out.println(employee.getInfo());

    }
}