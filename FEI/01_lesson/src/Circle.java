public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateCircleProperties() {
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Circle with radius %.2f:\n", radius);
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);
    }
}
