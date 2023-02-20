package grocerylist;

import java.util.*;

public class GroceryList {
    public static void main(String[] args) {
        Map<String, List<GroceryItem>> groceryList = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Would you like to create a grocery list? (y/n): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("y")) {
                while (true) {
                    System.out.print("Would you like to enter a new item? (y/n): ");
                    response = scanner.nextLine();
                    if (response.equalsIgnoreCase("y")) {
                        System.out.println("Select a category: ");
                        System.out.println("1. Produce");
                        System.out.println("2. Meat");
                        System.out.println("3. Dairy");
                        System.out.println("4. Frozen");
                        System.out.println("5. Other");

                        int category = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter the name of the item: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter how many of the item: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();

                        GroceryItem item = new GroceryItem(name, quantity);

                        switch (category) {
                            case 1:
                                groceryList.computeIfAbsent("Produce", k -> new ArrayList<>()).add(item);
                                break;
                            case 2:
                                groceryList.computeIfAbsent("Meat", k -> new ArrayList<>()).add(item);
                                break;
                            case 3:
                                groceryList.computeIfAbsent("Dairy", k -> new ArrayList<>()).add(item);
                                break;
                            case 4:
                                groceryList.computeIfAbsent("Frozen", k -> new ArrayList<>()).add(item);
                                break;
                            case 5:
                                groceryList.computeIfAbsent("Other", k -> new ArrayList<>()).add(item);
                                break;
                        }

                    } else if (response.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("Invalid input.");
                    }
                }

                System.out.println("Grocery list:");
                for (String category : groceryList.keySet()) {
                    System.out.println(category);
                    List<GroceryItem> items = groceryList.get(category);
                    items.sort(Comparator.comparing(GroceryItem::getName));
                    for (GroceryItem item : items) {
                        System.out.println("\t" + item.getName() + " (" + item.getQuantity() + ")");
                    }
                }
                break;

            } else if (response.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}
