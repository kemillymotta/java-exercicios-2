package setNmap.exercises.services;

import java.util.HashMap;
import java.util.Map;

public class GameInventoryManager {

    private Map<String, Integer> inventory;

    public GameInventoryManager() {
        inventory = new HashMap<>();
    }

    public void addOrRestockItem (String item, int quantity) {

        if (quantity <= 0) {
            System.out.println("Enter a valid quantity.");
            return;
        }

        if(!inventory.containsKey(item)) {
            inventory.put(item, quantity);

            System.out.println("Item added!");
        } else {
            int currentQuantity = inventory.get(item);
            inventory.put(item, (currentQuantity + quantity));

            System.out.printf("%s's quantity updated!", item);
        }
    }

    public void useItem(String item, int quantity) {

        inventory.compute(item, (key, currentQuantity) -> {

            if (currentQuantity == null) {
                System.out.println("Item not found!");
                return null;
            }

            if (quantity <= 0) {
                System.out.println("It has to be more than 0.");
                return currentQuantity;
            }

            if (currentQuantity < quantity) {
                System.out.println("Not enough.");
                return currentQuantity;
            };

            int newQuantity = currentQuantity - quantity;

            if (newQuantity == 0) {
                System.out.println("Item removed from inventory.");
                return null;
            }

            System.out.printf("%s's quantity updated!%n", key);
            return newQuantity;
        });
    }

    public void checkItem (String item) {

        if(inventory.containsKey(item)) {
            int quantity = inventory.get(item);
            System.out.printf("There's %d %s%n", quantity, item);
        } else {
            System.out.println("Item not found!");
        }
    }

    public void showInventory() {

        if(inventory.isEmpty()) {
            System.out.println("No items in inventory.");
            return;
        }

        for(Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }

    public void showTotalUnits () {
        int total = 0;

        for(Integer items : inventory.values()) {
            total += items;
        }

        System.out.printf("Total items: %d%n", total);
    }
}
