package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square perimeter");
        return 4 * length;
    }

    @Override
    public double getArea() {
        System.out.println("Square area");
        return length * length;
    }


    // accessors
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }



//    // instance variable
//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        System.out.println("Square get area.");
//        return side * side;
//    }
//
//    @Override
//    public double getPerimeter() {
//        System.out.println("Square get perimeter.");
//        return 4 * side;
//    }

}
