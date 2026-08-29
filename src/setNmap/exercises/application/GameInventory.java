package setNmap.exercises.application;

import java.util.Scanner;
import setNmap.exercises.services.GameInventoryManager;

public class GameInventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameInventoryManager inventory = new GameInventoryManager();

        int op = 0;

        while (op !=6) {
            System.out.println("\n=== GAME INVENTORY ===");
            System.out.println("1 - Add or restock item");
            System.out.println("2 - Use item");
            System.out.println("3 - Check item");
            System.out.println("4 - Show inventory");
            System.out.println("5 - Show total units");
            System.out.println("6 - Exit");
            op = sc.nextInt();
            sc.nextLine();

            String item;
            int quantity = 0;

            switch(op) {
                case 1:
                    item = itemName(sc);

                    System.out.print("Quantity: ");
                    quantity = sc.nextInt();

                    inventory.addOrRestockItem(item, quantity);
                    break;
                case 2:

                    item = itemName(sc);

                    System.out.print("Quantity: ");
                    quantity = sc.nextInt();

                    inventory.useItem(item, quantity);
                    break;
                case 3:
                    item = itemName(sc);

                    inventory.checkItem(item);
                    break;
                case 4:
                    inventory.showInventory();
                    break;
                case 5:
                    inventory.showTotalUnits();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;

            }



        }

        sc.close();
    }

    public static String itemName(Scanner sc) {
        String item;
        do {
            System.out.print("Item: ");
            item = sc.nextLine();

            if (item.isBlank()) {
                System.out.println("Enter a valid item");
            }

        } while (item.isBlank());

        return item;
    }

}
