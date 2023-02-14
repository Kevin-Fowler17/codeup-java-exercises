import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayLecture {

    public static void main(String[] args) {

        // declared, and initialized, an array use "new" to create it, data type and size
        // default value is zero
        int [] ages = new int[10];
        ages[0] = 42;
        ages[5] = 75;

        Input input = new Input();
        System.out.print("How many elements?");
//        int arrayLength = input.getInt():
//        ages = new int[arrayLength];
        ages = new int[12];
        ages[11] = 25;
        System.out.println(Arrays.toString(ages));

        // array initializers
//        String [] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String [] daysOfWeek = {"20", "11", "2", "Wed", "Thu", "Fri", "Sat"};
        System.out.println(Arrays.toString(daysOfWeek));

        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.println(daysOfWeek[i]);
//            daysOfWeek[i] = "blah";
        }
        System.out.println(Arrays.toString(daysOfWeek));

        for (String day: daysOfWeek) {
            System.out.println(day);
            day = "blah";
        }
//        Arrays.fill(daysOfWeek, "blah");
        System.out.println(Arrays.toString(daysOfWeek));



        String [] otherArray = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        System.out.println(daysOfWeek == otherArray);
        System.out.println(Arrays.equals(daysOfWeek, otherArray));

        String [] newArray = Arrays.copyOf(daysOfWeek, 10);
        System.out.println(Arrays.toString(newArray));

//        daysOfWeek = Arrays.copyOf(daysOfWeek, 15);
//        System.out.println(Arrays.toString(daysOfWeek));

        Arrays.sort(daysOfWeek);
        System.out.println(Arrays.toString(daysOfWeek));


    }



}
