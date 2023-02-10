import java.util.Scanner;

public class MethodsLecture {
    private static String myName;

    // defining the function, and method overloading
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }
    public static String sayHello() {
        return String.format("Hello there!");
    }
    public static String sayHello(int numRepeats) {
        String str = "";
        for (int i = 0; i < numRepeats; i++) {
            str += sayHello() + "!!\n";
        }
        return str;
    }




    public static void main(String[] args) {

        // since we are in this class, we don't need to have the class name
        System.out.println(sayHello("bob"));
        System.out.println(MethodsLecture.sayHello("bob"));

        System.out.println(MethodsLecture.sayHello());

        System.out.println(MethodsLecture.sayHello(5));


//        myName = "jimbob";
//        changeMyName(myName, "bob");
//        System.out.println(myName);
//
//        myName = makeNewName("bob");



        // Recursion
        Scanner input = new Scanner(System.in);
        int n = getNumberFromOneTo10(input);

        input.close();



    }

    private static int getNumberFromOneTo10(Scanner input) {
        System.out.print("Enter a number from 1 to 10: ");
        int aNumber = input.nextInt();
        if(aNumber < 1 || aNumber > 10) {
            return getNumberFromOneTo10(input);
        }
        return aNumber;
    }

//    private static String makeNewName(String oldName, String newName) {
//        myName = newName;
//        System.out.println(myName);
//    }

//    private static void changeMyName(String oldName, String newName) {
//
//        oldName = newName;
//        System.out.println("oldName is now " + oldName);
//
//    }

}
