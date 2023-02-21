package grocerylist;

import util.Input;

import java.util.*;

public class GroceryApp {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Item>> list = new HashMap<>();

        Input input = new Input();
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        String itemDepartment = "";

        boolean createGroceryList = input.yesNo("Would you like to create a grocery list? (y/n): ");

        while (createGroceryList) {

            do {
                cont = input.yesNo("\nWould you like to enter a new item? (y/n): ");

                if (cont) {

                    list.put("Butcher", new ArrayList<>());
                    list.put("Dairy", new ArrayList<>());
                    list.put("Frozen", new ArrayList<>());
                    list.put("Nonperishable", new ArrayList<>());
                    list.put("Produce", new ArrayList<>());

                    int i = 1;
                    System.out.println("");
                    for (String department : list.keySet()) {
                        System.out.printf("%d - %s\n", i, department);
                        i += 1;
                    }

                    while (!list.containsKey(itemDepartment)) {
                        System.out.printf("\nWhat department is the item in? (enter the department name): ");
                        itemDepartment = scanner.nextLine();

                        if (!list.containsKey(itemDepartment)) {
                            System.out.println("Department not in the list, please re-enter.");
                        }

                    }

                    System.out.printf("\nWhat is the name of the item? (enter the items name): ");
                    String itemName = scanner.nextLine();

                    System.out.printf("\nHow many of this item do you want? ");
                    int itemQuantity = scanner.nextInt();

                    Item item = new Item(itemName, itemQuantity);

                    if (itemDepartment.equalsIgnoreCase("Butcher")) {
                        list.put("Butcher", new ArrayList<>()).add(item);
                    } else if (itemDepartment.equalsIgnoreCase("Dairy")) {
                        list.put("Dairy", new ArrayList<>()).add(item);
                    } else if (itemDepartment.equalsIgnoreCase("Frozen")) {
                        list.put("Frozen", new ArrayList<>()).add(item);
                    } else if (itemDepartment.equalsIgnoreCase("Nonperishable")) {
                        list.put("Nonperishable", new ArrayList<>()).add(item);
                    } else {
                    }
                }

            } while (cont);



            System.out.println("Grocery list:");
            for (String department : list.keySet()) {
                System.out.println(itemDepartment);
                List<Item> items = list.get(itemDepartment);
                items.sort(Comparator.comparing(Item::getName));
                for (Item item : items) {
                    System.out.println("" + item.getName() + " (" + item.getQuantity() + ")");
                }
            }

            break;

        }
    }
}
