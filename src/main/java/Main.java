import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // Format for two decimal places

        while (true) {
            double total = 0.00;
            Item[][][] items = inventory.getItems();

            System.out.println("-----------------------------");
            System.out.println("Welcome to my Vending Machine!");
            System.out.println("-----------------------------");
            System.out.println("-----------------------------");

            while (true) {
                // Display available categories
                System.out.println("Available Categories");
                System.out.println("-----------------------------");
                System.out.println("1. Beverages");
                System.out.println("-------------");
                System.out.println("2. Snacks");
                System.out.println("-------------");
                System.out.println("3. Candy");
                System.out.println("-------------");
                System.out.println("4. Chips");
                System.out.println("-------------");
                System.out.println("5. Cookies");
                System.out.println("-------------");
                System.out.println("6. Popcorn");
                System.out.println("-------------");
                System.out.println("0. Exit");

                // Prompt the user to choose a category
                System.out.print("Please enter the category number (or press 0 to exit): ");
                int selectedCategory = scanner.nextInt();

                if (selectedCategory == 0) {
                    break; // Exit the loop if the user chooses 0
                } else if (selectedCategory < 0 || selectedCategory > 6) {
                    System.out.println("Invalid category number. Please enter a valid category number.");
                    continue;
                }

                // Display items from the selected category
                System.out.println("Items in the selected category:");
                for (int x = 0; x < 6; x++) {
                    for (int y = 0; y < 6; y++) {
                        for (int z = 0; z < 6; z++) {
                            Item item = items[x][y][z];
                            if (item != null && item.getCategory().ordinal() + 1 == selectedCategory) {
                                System.out.println("Item ID: " + item.getProductId());
                                System.out.println("Name: " + item.getName());
                                System.out.println("Price: $" + item.getPrice());
                                System.out.println("Nutritional Facts: " + item.getNutritionalFacts());
                                System.out.println();
                            }
                        }
                    }
                }

                // Allow the user to select items from the chosen category
                while (true) {
                    System.out.print("Enter item number (or press 0 to go back to category selection): ");
                    int selectedItem = scanner.nextInt();

                    if (selectedItem == 0) {
                        break; // Go back to category selection
                    }

                    Item selectedProduct = inventory.getItemById(selectedItem);
                    if (selectedProduct != null && selectedProduct.getCategory().ordinal() == selectedCategory - 1) {
                        total += selectedProduct.getPrice();
                        System.out.println("Added " + selectedProduct.getName() + " to your cart.");
                    } else {
                        System.out.println("Item not found in the selected category. Please enter a valid item number.");
                    }
                }
            }

            // Prompt the user to enter the total amount paid
            System.out.print("Please Enter the total amount paid: ");
            double amountPaid = scanner.nextDouble();

            // Calculate the change
            double change = amountPaid - total;

            // Display the change to the user with two decimal places
            System.out.println("Change: $" + df.format(change));

            // Provide change in denominations
            provideChangeInDenominations(change);

            // Thank the user
            System.out.println("--------------------------------------");
            System.out.println("Thank you for using my vending machine!");
            System.out.println("---------------------------------------");
        }
    }

    private static void provideChangeInDenominations(double change) {
        // Convert change to cents
        int changeInCents = (int) (change * 100);

        // Calculate and display change in denominations
        int dollars = changeInCents / 100;
        changeInCents %= 100;
        int quarters = changeInCents / 25;
        changeInCents %= 25;
        int dimes = changeInCents / 10;
        changeInCents %= 10;
        int nickels = changeInCents / 5;
        int pennies = changeInCents % 5;

        System.out.println("Change in denominations:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
