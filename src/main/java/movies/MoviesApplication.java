package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        // don't need code below because calling the input package
//        Scanner input = new Scanner(System.in);

        boolean ask = true;

        do {

            System.out.println(optionsDisplay());

            int userResponse = userChoice();

            ask = filterByMovieChoice(userResponse);

        } while (ask);

    }

    public static String optionsDisplay() {
        String optionsText = "What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n";
        return optionsText;
    };

    public static int userChoice() {
        Input input = new Input();

        return input.getInt(0, 5, "Enter your choice: ");
    }

    public static boolean filterByMovieChoice(int response) {

        boolean askAgain = true;

        if (response == 1) {
            System.out.print("\n");
            for (Movie movie : MoviesArray.findAll()) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
            System.out.print("\n");
        } else if (response == 2) {
            System.out.print("\n");
            showMoviesByChoice("animated");
            System.out.print("\n");
        } else if (response == 3) {
            System.out.print("\n");
            showMoviesByChoice("drama");
            System.out.print("\n");
        } else if (response == 4) {
            System.out.print("\n");
            showMoviesByChoice("horror");
            System.out.print("\n");
        } else if (response == 5) {
            System.out.print("\n");
            showMoviesByChoice("scifi");
            System.out.print("\n");
        } else {
            System.out.println("Bye!");
            askAgain = false;
        }

        return askAgain;
    }

    private static void showMoviesByChoice (String category) {
        for(Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }
    }

}
