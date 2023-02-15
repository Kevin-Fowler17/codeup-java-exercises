package shapes;

public class Square extends Rectangle {

    // instance variable
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;

    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

}
