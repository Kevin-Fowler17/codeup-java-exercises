package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class GradesApplication {

    public static void main(String[] args) {


        boolean cont = true;
        Scanner input = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();

        Student kevin = new Student("Kevin");
        kevin.addGrade(75);
        kevin.addGrade(85);
        kevin.addGrade(95);
        students.put("Kevin012", kevin);

        Student bill = new Student("Bill");
        bill.addGrade(75);
        bill.addGrade(85);
        bill.addGrade(95);
        students.put("Bill345", kevin);

        Student derek = new Student("Derek");
        derek.addGrade(75);
        derek.addGrade(85);
        derek.addGrade(95);
        students.put("Derek678", kevin);

        Student john = new Student("John");
        john.addGrade(75);
        john.addGrade(85);
        john.addGrade(95);
        students.put("John901", kevin);

//        do {


            System.out.println("""
                    Welcome!
                                    
                    Here are the GitHub usernames of our students:
                    """);

            for (String userName : students.keySet()) {
                System.out.printf("|%s| ", userName);
            }

            System.out.print("\n");
            System.out.println("\nWhat student would you like to see more information on?\n\n>");
            String userSelection = input.next();

             System.out.println(userSelection);

//            cont = input.yesNo("Do you want to make another circle? ");
//        } while (cont);



    }
}
