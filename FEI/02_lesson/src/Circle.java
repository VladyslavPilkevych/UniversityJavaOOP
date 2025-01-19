import java.lang.Math;
public class Circle extends Shape
{
    private int radius;

    Circle(int radius)
    {
        this.radius = radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("Circle area is calculated. Result is " + Math.PI * Math.sqrt(radius));
    }
}
