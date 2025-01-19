import student.tasks.PackageExample;

public class Main {
    public static void main(String[] args) {

        Square square = new Square(12.0);
        square.calculateSquareProperties();


        Circle circle = new Circle(8.0);
        circle.calculateCircleProperties();

        Employee employee = new Employee("John", "Doe", 45, "Software Engineer", 93500.00, 27);
        employee.displayEmployeeInfo();

        int[] numbers = {5, 10, 15, 20, 25};
        ArrayOperations arrayOps = new ArrayOperations();
        arrayOps.sumAndAverage(numbers);

        PackageExample example = new PackageExample();
        example.displayMessage();
    }
}