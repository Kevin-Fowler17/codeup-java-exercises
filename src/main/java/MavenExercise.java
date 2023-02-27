import org.apache.commons.lang3.StringUtils;
import util.Input;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        String mavenExerciseText = "";

        System.out.print("\nEnter something: ");
        mavenExerciseText = scanner.nextLine();

        System.out.println("You Entered: \"" + mavenExerciseText + "\"");
        if (StringUtils.isNumeric(mavenExerciseText)) {
            System.out.println("\"" + mavenExerciseText + "\" is a number");
        } else {
            System.out.println("\"" + mavenExerciseText + "\" is not a number");
        }

        System.out.println("Flipped Case: " + StringUtils.swapCase(mavenExerciseText));

        System.out.println("Reversed: " + StringUtils.reverse(mavenExerciseText));
    }



}
