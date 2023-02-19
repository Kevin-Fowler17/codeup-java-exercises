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
//        String itemDepartment = "";
//        String itemName = "";
//        int itemQuantity = 0;

        HashMap<String, ArrayList<Item>> departments = new HashMap<>();
        departments.put("Butcher", new ArrayList<>());
        departments.put("Dairy", new ArrayList<>());
        departments.put("Frozen", new ArrayList<>());
        departments.put("Nonperishable", new ArrayList<>());
        departments.put("Produce", new ArrayList<>());

        boolean createGroceryList = input.yesNo("Would you like to create a grocery list? ");

        if (createGroceryList == true) {

            do {
                cont = input.yesNo("\nWould you like to enter a new item? ");

                int i = 1;
                System.out.println("");
                for (String department : departments.keySet()) {
                    System.out.printf("%d - %s\n", i, department);
                    i += 1;
                }

                String itemDepartment = "";
                while (!departments.containsKey(itemDepartment)) {
                    System.out.printf("\nWhat department is the item in? (enter the department name): ");
                    itemDepartment = scanner.nextLine();

                    if(!departments.containsKey(itemDepartment)) {
                        System.out.println("Department not in the list, please re-enter: ");
                    }

                }

                System.out.printf("\nWhat is the name of the item? (enter the items name): ");
                String itemName = scanner.nextLine();
                System.out.printf("\nHow many of this item do you want?");
                int itemQuantity = scanner.nextInt();




            } while (cont);
        }
    }
}
