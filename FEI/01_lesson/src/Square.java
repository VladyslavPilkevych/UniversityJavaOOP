public class Square {

    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public void calculateSquareProperties() {
        double area = sideLength * sideLength;
        double perimeter = 4 * sideLength;
        double diagonal = Math.sqrt(2) * sideLength;

        System.out.printf("Square with side length %.2f:\n", sideLength);
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);
    }

}
