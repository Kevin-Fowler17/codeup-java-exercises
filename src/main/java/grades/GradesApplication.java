package grades;

import util.Input;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;

        HashMap<String, Student> students = new HashMap<>();

        Student kevin = new Student("Kevin");
        kevin.addGrade(50);
        kevin.addGrade(55);
        kevin.addGrade(60);
        students.put("kfowl50", kevin);

        Student emily = new Student("Emily");
        emily.addGrade(65);
        emily.addGrade(70);
        emily.addGrade(75);
        students.put("efowl18", emily);

        Student madison = new Student("Madison");
        madison.addGrade(80);
        madison.addGrade(85);
        madison.addGrade(90);
        students.put("mfowl15", madison);

        Student olivia = new Student("Olivia");
        olivia.addGrade(95);
        olivia.addGrade(100);
        olivia.addGrade(100);
        students.put("ofowl08", olivia);

        System.out.println("""
                Welcome!
                                
                Here are the GitHub usernames of our students:
                """);


        for (String student : students.keySet()) {
            System.out.printf("|%s| ", student);
        }

        System.out.print("\n");

        do {

            System.out.println("\nWhat student would you like to see more information on?\n");

            String userSelection = scanner.nextLine();

            if (students.containsKey(userSelection)) {
                System.out.printf("\nName: %s - GitHub Username: %s\n", students.get(userSelection).getName(), userSelection);
                System.out.printf("Current Average: %.1f\n\n", students.get(userSelection).getGradeAverage());
//                System.out.printf("Class Average: %.1f\n\n", getClassAverage(students));
//                getClassAverage(students)
            } else {
                System.out.println("\nSorry, no student found with the GitHub username of \"" + userSelection + "\".\n");
            }

            cont = input.yesNo("Would you like to see another student?\n\n");


        } while (cont);

        System.out.println("\nGoodbye, and have a wonderful day!");

    }


    private double getClassAverage(HashMap students) {

        Set<String> keys = students.keySet();
        for (String key : keys) {
            Student student = (Student) students.get(key);
            System.out.println(student);
        }
        return 2;
    }

}
