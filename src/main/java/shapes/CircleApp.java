package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        double userRadius = input.getDouble(1,100);

        Circle myCircle = new Circle(userRadius);

        System.out.println("Area: " + myCircle.getArea());
        System.out.println("Circumference: " + myCircle.getCircumference());

    }

}
