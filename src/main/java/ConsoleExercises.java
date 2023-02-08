import java.util.Scanner;
import java.util.regex.Pattern;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        // The value of pi is approximately 3.14.
        System.out.printf("The value of pi is approximately %.2f.%n", pi);
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner input = new Scanner(System.in);

        input.useDelimiter("\n");

        System.out.print("Enter your favorite number: ");
        int age = input.nextInt();
        System.out.println("Your favorite number is: " + age);

        System.out.print("List your three favorite fruits: ");
        String FirstFruit = input.next();
        String SecondFruit = input.next();
        String ThirdFruit = input.next();
        System.out.println(FirstFruit);
        System.out.println(SecondFruit);
        System.out.println(ThirdFruit);

        System.out.printf("%s%n%s%n%s%n", FirstFruit, SecondFruit, ThirdFruit);

        // get the new line char out of the buffer
        input.nextLine();

        System.out.print("What is your favorite saying? ");
        String FavoriteSaying = input.nextLine();
        System.out.println(FavoriteSaying);

        System.out.print("What is the length of your Codeup classroom: ");
        String str = input.nextLine();
//        int length = Integer.parseInt(str)
        double length = Double.parseDouble(str);

        System.out.print("What is the width of your Codeup classroom: ");
        str = input.nextLine();
//        int width = Integer.parseInt(str);
        double width = Double.parseDouble(str);

        double perimeter = (length * 2) + (width * 2);
        double area = length * width;

//        System.out.printf("Length: %d%n" +
//                        "Width: %d%n" +
//                        "Area: %d%n" +
//                        "Perimeter: %d%n"
//                , length, width, area, perimeter);

        System.out.printf("""
                        Length: %.1f
                        Width: %.1f
                        Area: %.1f
                        Perimeter: %.1f%n"""
                       , length, width, area, perimeter);


        input.close();

    }
}
