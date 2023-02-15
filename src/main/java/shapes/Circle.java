package shapes;

public class Circle {

    private double radius;

    private static int circleCount = 0;

    public Circle(double r) {
        this.radius = r;
        circleCount += 1;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // accessors
    public static int getCircleCount() {
        return circleCount;
    }

    public static void setCircleCount(int circleCount) {
        Circle.circleCount = circleCount;
    }

}
