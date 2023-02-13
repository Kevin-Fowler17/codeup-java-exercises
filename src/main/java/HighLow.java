import java.util.Scanner;
import java.lang.Math;
public class HighLow {

    public static int numberGenerator() {
        return (int) (Math.random() * 100) + 1;
    }

    public static int getNumberFromOneTo100(Scanner input){

        int guess = 0;
        int remaining = 5;
        int counter = 0;
        int randNum = numberGenerator();

        System.out.println("Number is: " + randNum);
        System.out.print("Enter an integer from 1 to 100: ");
        guess = input.nextInt();

        do {

            if (remaining > 0 && remaining < 5) {
                System.out.println("You have " + remaining + " guesses left. Guess again, enter an integer from 1 to 100: ");
                guess = input.nextInt();
            }

            if ((guess < 1 || guess > 100) && remaining > 1) {
                System.out.println("That is not a number from 1 to 100.");
            } else if ((guess < randNum) && remaining > 1) {
                System.out.println("HIGHER");
            } else if ((guess > randNum) && remaining > 1) {
                System.out.println("LOWER");
            } else if (guess == randNum){
                System.out.println("GOOD GUESS!");
                break;
            } else {
                System.out.println("That's five guesses, you lose. The number was " + randNum);
                break;
            }

            remaining -= 1;
            counter += 1;

        } while (true);

        System.out.println("Game over");
        return randNum;
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        getNumberFromOneTo100(input);

        input.close();

    }

}
