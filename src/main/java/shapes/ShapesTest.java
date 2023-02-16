package shapes;

public class ShapesTest {

    public static void main(String[] args) {


        Measurable myShape;

        Rectangle box1 = new Rectangle(5,4);
        myShape = box1;
        System.out.println("Box 1 area is: " + myShape.getArea());
        System.out.println("Box 1 permiter is: " + myShape.getPerimeter());


        Square box2 = new Square(5);
        myShape = box2;
        System.out.println("Box 2 area is: " + myShape.getArea());
        System.out.println("Box 2 permiter is: " + myShape.getPerimeter());



//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Box 1 area is: " + box1.getArea());
//        System.out.println("Box 1 perimeter is: " + box1.getPerimeter());

//        Rectangle box2 = new Square(5);
//        System.out.println("Box 2 area is: " + box2.getArea());
//        System.out.println("Box 2 perimeter is: " + box2.getPerimeter());

    }

}
