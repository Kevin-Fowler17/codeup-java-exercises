package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

            Input input = new Input();
            boolean cont = true;

        do {

            double userRadius = input.getDouble(1, 100);

            Circle myCircle = new Circle(userRadius);

            System.out.println("Area: " + myCircle.getArea());
            System.out.println("Circumference: " + myCircle.getCircumference());

            Circle.getCircleCount();

            cont = input.yesNo("Do you want to make another circle? ");

        } while (cont);

        System.out.println("You created " + Circle.getCircleCount() + " circles.");

    }

}
