public class Square extends Shape
{
    private int side;

    Square(int side)
    {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Square area calculated, result is " + side * side);
    }
}
