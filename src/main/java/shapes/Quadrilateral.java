package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    // protected properties for length and width.
    protected double length;
    protected double width;

    // a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // accessors
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

}

