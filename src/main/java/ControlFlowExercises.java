import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }


//        int CountByTwo = 0;
//        do {
//            System.out.println(CountByTwo);
//            CountByTwo += 2;
//        }while(CountByTwo <= 100);
//        for (int CountByTwo = 0; CountByTwo <= 100; CountByTwo += 2) {
//            System.out.println(CountByTwo);
//        }


//        int CountByFive = 100;
//        do {
//            System.out.println(CountByFive);
//            CountByFive -= 5;
//        }while(CountByFive >= -10);
//        for (int CountByFive = 100; CountByFive >= -10; CountByFive -= 5) {
//            System.out.println(CountByFive);
//        }


//        long Squared = 2;
//        do {
//            System.out.println(Squared);
//            Squared = Squared * Squared;
//        }while(Squared < 1000000);
//        for (long Squared = 2; Squared < 1000000; Squared *= Squared) {
//            System.out.println(Squared);
//        }


//        for (int i = 1; i <= 100 ; i++) {
//            if (i % 3 == 0 && i % 5 != 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0 && i % 3 != 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }


        String done = "yes";
        do {

            System.out.print("What number would you like to go up to? ");
            int num = input.nextInt();
            double squared = 1;
            double cubed = 1;

            System.out.printf("%nHere is your table!%n%n");
            System.out.printf("number | squared | cubed%n");
            System.out.printf("------ | ------- | -----%n");

            for (int i = 1; i <= num; i++) {
                squared = Math.pow(i, 2);
                cubed = Math.pow(i, 3);
                System.out.printf("%-6d | %-7.0f | %-5.0f%n", i, squared, cubed);
            }

            System.out.printf("%nDo you want to enter another number? ");
            done = input.next();

        } while (!done.equals("no"));




        input.close();

    }

}
