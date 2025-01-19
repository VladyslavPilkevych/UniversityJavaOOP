public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        Person[] people = { new Person("Nick", 23), new Student("Tom", 14, "jdiwo1e19je1") };
        for (Person human : people) {
            System.out.println(human.getDescription());
        }

        System.out.println("Task2");
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(4);
        circle.calculateArea();
        rectangle.calculateArea();
        square.calculateArea();

        System.out.println("Task 3");
        Printer printer = new Printer();
        printer.print("Hello, World!");
        printer.print(42);
        Figure polygon = new Polygon();
        Figure octagon = new Octagon();
        polygon.draw();
        octagon.draw();

        System.out.println("Task 4:");
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}