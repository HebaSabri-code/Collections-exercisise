package Main;

import java.util.ArrayList;

public class ShoppingList {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        // Add items
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Juice");
        shoppingList.add("Rice");

        // Print list
        System.out.println("Shopping List:");

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        // Remove item
        shoppingList.remove("Juice");

        // Print updated list
        System.out.println("\nUpdated List:");

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }
}