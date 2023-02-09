import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String question = "";

        do {

            System.out.print("Q: ");
            question = input.nextLine();

            if (question.endsWith("?")) {
                // Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
                System.out.println("Sure.");
            } else if (question.endsWith("!")) {
                // He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
                System.out.println("Whoa, chill out!");
            } else if (question.isEmpty()) {
                // He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
                System.out.println("Fine. Be that way!");
            } else {
                // He answers 'Whatever.' to anything else.
                System.out.println("Whatever.");
            }

        } while (!question.equalsIgnoreCase("Go to your room"));

        input.close();

    }

}
