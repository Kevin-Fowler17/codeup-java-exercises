import java.util.Scanner;

public class Strings_Lecture {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);


        // Immutability and Concatenation
        String myName = "bob";
        myName = "Robert";

        // Convert number to string
        int age = 42;
        // String formattedAge = Integer.toString(age);
        String formattedAge = "" + (age); //Short version of above to turn into a string


//        myName = null;
//        System.out.println(myName.equals("Robert"))
        System.out.println("Robert".equals(myName));;
        // startsWith
        System.out.println(myName.startsWith("Rob"));
        System.out.println(myName.startsWith("rob"));
        System.out.println("DocRob".startsWith("D"));

        // endsWith
        System.out.println("DocRob".endsWith("Rob"));


        // charAt
        System.out.println("DocRob".charAt(2));


        //indexOf
        System.out.println("DocRob".indexOf("Ro"));


        int index = -1;
        do {

        index = "The quick brown fox jumped over the lazy dog.".indexOf(" ", index + 1);
        if (index > -1) {
            System.out.println("Found a space at index " + index);
        }
        }while (index > -1);


        // lastIndexOf
        System.out.println("DocRob".lastIndexOf("ob"));


        // lenth
        System.out.println("DocRob".length());


        // replace
        System.out.println("DocRob".replace("o", "i"));
        System.out.println("DocRob".replaceAll("o", "i"));


        // subsString
        System.out.println("DocRob".substring(3, 5));


        // toUpperCase and toLowerCase
        System.out.println("DocRob".toUpperCase());
        System.out.println("DocRob".toLowerCase());


        // trim
        System.out.println("    the quick    ".trim() + "XXXX");


        // escape characters
        System.out.println("  \n  the quick    ");// new line
        System.out.println("  \t  the quick    ");// tab
        System.out.println("  \\  the quick    ");// print a backslash


        input.close();

    }

}
