package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication2 {

    public static void main(String[] args) {

        Input input = new Input();
        boolean cont = true;
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();

        Student kevin = new Student("Kevin");
        kevin.addGrade(75);
        kevin.addGrade(85);
        kevin.addGrade(95);
        students.put("kevin012", kevin);

        Student bill = new Student("Bill");
        bill.addGrade(75);
        bill.addGrade(85);
        bill.addGrade(95);
        students.put("bill345", bill);

        Student derek = new Student("Derek");
        derek.addGrade(75);
        derek.addGrade(85);
        derek.addGrade(95);
        students.put("derek678", derek);

        Student john = new Student("John");
        john.addGrade(75);
        john.addGrade(85);
        john.addGrade(95);
        students.put("john901", john);



            System.out.println("""
                    Welcome!
                                    
                    Here are the GitHub usernames of our students:
                    """);

            for (String userName : students.keySet()) {
                System.out.printf("|%s| ", userName);
            }

            System.out.print("\n");

        do {

            System.out.println("\nWhat student would you like to see more information on?\n");
            String userSelection = scanner.nextLine();

            if (students.containsKey(userSelection)) {
                System.out.printf("\nName: %s - GitHub Username: %s%n", students.get(userSelection).getName(), userSelection);
                System.out.printf("Current Average: %.2f%n", students.get(userSelection).getGradeAverage());
            } else {
                System.out.println("""
                                   
                                   Sorry, no student found with the GitHub username of "pizza".""");
            }

            cont = input.yesNo("\nWould you like to see another student?\n\n");

        } while (cont);

        System.out.println("\nGoodbye, and have a wonderful day!");

    }

}