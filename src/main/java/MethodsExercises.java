import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int multiplicationWithoutMultiplication (int num1, int num2) {
        int total = 0;
        for (int i = 1; i <= num2 ; i++) {
            total += num1;
        }
        return total;
    }

    public static int multiplicationWithRecursion (int num1, int num2) {
        if (num2 == 0) {
            return 0;
        }
        if (num2 == 1) {
            return num1;
        }
        return num1 + multiplicationWithRecursion(num1, num2 - 1);
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static int getIntger(Scanner input) {
        System.out.print("Enter a number from 1 to 10: ");
        int aNumber = input.nextInt();
        if(aNumber < 1 || aNumber > 10) {
            return getIntger(input);
        }
        return aNumber;
    }

    public static long factorial(int integer) {
        long total = 1;
        for (int i = 1; i <= integer; i++) {
            total *= i;
        }
        return total;
    }

    public static int rollTheDice(int sides) {
        return (int) (Math.random() * sides) + 1;
    }


    public static void main(String[] args) {

        System.out.println(MethodsExercises.addition(4, 5));

        System.out.println(MethodsExercises.subtraction(4, 5));

        System.out.println(MethodsExercises.multiplication(4, 5));
        System.out.println(MethodsExercises.multiplicationWithoutMultiplication(9,9));
        System.out.println(MethodsExercises.multiplicationWithRecursion(9,9));

        System.out.println(MethodsExercises.division(20, 7));

        System.out.println(MethodsExercises.modulus(9, 40));

        Scanner input = new Scanner(System.in);
        int n = getIntger(input);

        String str = "";
        int integer = 0;
        do {
            System.out.print("Enter an integer from 1 to 10: ");
            integer = input.nextInt();
            if (integer < 1 || integer > 10) {
                System.out.println("The integer " + integer + " is out of range.");
            } else {
                System.out.println(MethodsExercises.factorial(integer));
            }
            System.out.print("Do you want to continue? ");
            str = input.next();
        } while (str.equalsIgnoreCase("y"));

        str = "";
        int sides = 0;
        do {
            System.out.print("How many sides do you want on the dice? ");
            sides = input.nextInt();
            System.out.print("Roll the dice when your are ready? ");
            str = input.next();

            if (str.equalsIgnoreCase("roll")) {
                for (int i = 1; i <= 2; i++) {
                    System.out.println(MethodsExercises.rollTheDice(sides));
                }
            }

            System.out.print("Do you want to continue? ");
            str = input.next();
        } while (str.equalsIgnoreCase("y"));



        input.close();

    }

}
