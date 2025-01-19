public class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int width, int height)
    {
        this.height = height;
        this.width = width;
    }
    @Override
    public void calculateArea() {
        System.out.println("Rectangle area calculated, result is " + height*width);
    }
}
