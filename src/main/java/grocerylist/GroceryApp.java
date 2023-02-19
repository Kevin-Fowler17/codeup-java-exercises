package grocerylist;

import util.Input;

import java.util.*;

public class GroceryApp {

    public static void main(String[] args) {

        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
//        String itemDepartment = "";
//        String itemName = "";
//        int itemQuantity = 0;

        HashMap<String, ArrayList<Item>> list = new HashMap<>();
        list.put("Butcher", new ArrayList<>());
        list.put("Dairy", new ArrayList<>());
        list.put("Frozen", new ArrayList<>());
        list.put("Nonperishable", new ArrayList<>());
        list.put("Produce", new ArrayList<>());

        boolean createGroceryList = input.yesNo("Would you like to create a grocery list? ");

        if (createGroceryList == true) {

            do {

                int i = 1;
                System.out.println("");
                for (String department : list.keySet()) {
                    System.out.printf("%d - %s\n", i, department);
                    i += 1;
                }

                String itemDepartment = "";
                while (!list.containsKey(itemDepartment)) {
                    System.out.printf("\nWhat department is the item in? (enter the department name): ");
                    itemDepartment = scanner.nextLine();

                    if(!list.containsKey(itemDepartment)) {
                        System.out.println("Department not in the list, please re-enter.");
                    }

                }

                System.out.printf("\nWhat is the name of the item? (enter the items name): ");
                String itemName = scanner.nextLine();

                System.out.printf("\nHow many of this item do you want? ");
                int itemQuantity = scanner.nextInt();

                list.get(itemDepartment).add(new Item(itemName, itemQuantity));

                System.out.printf("%s",list.containsValue(itemName));


                list.forEach((k,v) -> {
                    System.out.println(k + "[" + v + "]");
                });





                cont = input.yesNo("\nWould you like to enter a new item? ");

            } while (cont);
        }
    }
}
