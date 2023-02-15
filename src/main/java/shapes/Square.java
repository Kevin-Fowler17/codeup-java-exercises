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
        System.out.println("Square get area.");
        return side * side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square get perimeter.");
        return 4 * side;
    }

}
