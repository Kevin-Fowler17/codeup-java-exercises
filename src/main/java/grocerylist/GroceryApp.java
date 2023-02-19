package grocerylist;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryApp {

    public static void main(String[] args) {

        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;

        HashMap<String, ArrayList<Item>> list = new HashMap<>();
        list.put("Butcher", new ArrayList<>());
        list.put("Dairy", new ArrayList<>());
        list.put("Frozen", new ArrayList<>());
        list.put("Nonperishable", new ArrayList<>());
        list.put("Produce", new ArrayList<>());





        boolean createGroceryList = input.yesNo("Would you like to create a grocery list?\n");

        if (createGroceryList == true) {

            do {
                cont = input.yesNo("Would you like to enter a new item?\n");

                for (int i = 0; i < list.size(); i++) {
                    System.out.printf("%d - %s\n"1, list);
                }
//                for (String dept : list.keySet()) {
//                    System.out.printf("%d - %s",);
//                    System.out.printf("|%s| ", student);
//                }




//                Enter the name of the item.
//                Enter how many of the item.


            } while (cont);
        }
    }
}
