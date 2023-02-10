import java.util.Scanner;
import java.lang.Math;
public class HighLow {

    public static int numberGenerator() {
        return (int) (Math.random() * 100) + 1;
    }

//    public static int guessCheck(int guess) {
//
//    }



    public static int getNumberFromOneTo100(Scanner input){

        String str = "";
        int guess = 0;
        int remaining = 5;
        int counter = 0;
        int randNum = numberGenerator();

        System.out.println("Number is: " + randNum);
        System.out.print("Enter an integer from 1 to 100: ");
        guess = input.nextInt();

        do {
            remaining -= 1;
            counter += 1;
            if ((guess < 1 || guess > 100) && remaining > 0) {
                System.out.println("That is not a number from 1 to 100.");
                System.out.print("You have " + remaining + " guesses left. Guess again, enter an integer from 1 to 100: ");
                guess = input.nextInt();
            } else if ((guess < randNum) && remaining > 0) {
                System.out.println("HIGHER");
                System.out.print("You have " + remaining + " guesses left. Guess again, enter an integer from 1 to 100: ");
                guess = input.nextInt();
            } else if ((guess > randNum) && remaining > 0) {
                System.out.println("LOWER");
                System.out.print("You have " + remaining + " guesses left. Guess again, enter an integer from 1 to 100: ");
                guess = input.nextInt();
            } else if (guess == randNum){
                counter = 1;
                System.out.println("GOOD GUESS!");
            } else {
                System.out.println("That's five guesses, you lose. The number was " + randNum);
            }

        } while (counter > 0);

        return randNum;
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = getNumberFromOneTo100(input);

        input.close();

    }

}
