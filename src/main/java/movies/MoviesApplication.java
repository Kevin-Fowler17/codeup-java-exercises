package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(optionsDisplay());

//        while(running) {
//            System.out.println(returnMenuDisplay());

            int response = userChoice();
//            running = executeUserChoice(response);
//        }


    }

    public static String optionsDisplay() {
        String optionsText = "What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n";
        return optionsText;
    };

    public static int userChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int choice = input.getInt(0, 5);

        return choice;
    }

//    private static int promptUserForChoice() {
//        Input input = new Input();
//        System.out.println("Enter your choice: ");
//        int response = input.getInt(0, 5);
//
//        return response;
//    }

}
