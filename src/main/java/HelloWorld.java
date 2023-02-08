import java.sql.SQLOutput;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args)
    {
        // the program starts executing here
//        System.out.println("Hello world");
//        System.out.print("Hello world\n");

        int myFavoriteNumber = 72;
//        System.out.println(myFavoriteNumber);

        String myString = "This is my string value";
//        System.out.println(myString);

//        float myNumber = (float) 3.14;
        float myNumber = 3.14f;
//        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;

//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
//        System.out.println(x);
//        System.out.println(y);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter you age: ");
        int age =input.nextInt();
        System.out.println("Your age is " + age);

        // get the new line char out of the buffer after left by integer
        input.nextLine();

        System.out.print("Enter your name: ");
//        String aName = input.next();
        String aName = input.nextLine();

        System.out.println("Your name is " + aName);
//        aName = input.next();

//        System.out.println("Your OTHER name is " + aName);

//        System.out.print("Enter you age: ");
//        int age =input.nextInt();
//        System.out.println("Your age is " + age);

        input.close();


    }
}
