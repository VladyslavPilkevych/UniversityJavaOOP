public class Employee {
    private String name;
    private String surname;
    private int age;
    private String position;
    private double salary;
    private int retirementAge;

    public Employee(String name, String surname, int age, String position, double salary, int retirementAge) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.retirementAge = retirementAge;
    }

    public void displayEmployeeInfo() {
        System.out.printf("Employee: %s %s\n", name, surname);
        System.out.printf("Position: %s\n", position);
        System.out.printf("Salary: $%.2f\n", salary);
        System.out.printf("Years until retirement: %d\n", retirementAge - age);
    }
}
