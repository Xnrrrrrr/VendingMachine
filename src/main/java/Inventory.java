import java.util.Scanner;
public class Inventory {

    private Item[][][] items;

    public Inventory() {
        items = new Item[6][6][6];
        // Initialize items here, creating 36 items and placing them in the 6x6x6 array.

        // Layer 0
        items[0][0][0] = new Item(1, "COFFEE", 1.99, ProductCategory.BEVERAGES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[0][0][1] = new Item(2, "JUICE", 1.99, ProductCategory.BEVERAGES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[0][0][2] = new Item(3, "SODA", 1.99, ProductCategory.BEVERAGES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[0][1][0] = new Item(4, "WATER", 1.99, ProductCategory.BEVERAGES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[0][1][1] = new Item(5, "MILK", 1.99, ProductCategory.BEVERAGES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[0][1][2] = new Item(6, "ICED TEA", 1.99, ProductCategory.BEVERAGES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");

        // Layer 1
        items[1][0][0] = new Item(7, "BROWNIE", 1.50, ProductCategory.SNACKS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[1][0][1] = new Item(8, "CUPCAKE", 1.50, ProductCategory.SNACKS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[1][0][2] = new Item(9, "PRETZELS", 1.50, ProductCategory.SNACKS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[1][1][0] = new Item(10, "NUTS", 1.50, ProductCategory.SNACKS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[1][1][1] = new Item(11, "DANISH", 1.50, ProductCategory.SNACKS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[1][1][2] = new Item(12, "MUFFIN", 1.50, ProductCategory.SNACKS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");

        // Layer 2
        items[2][0][0] = new Item(13, "GUMMY WORMS", 1.35, ProductCategory.CANDY, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[2][0][1] = new Item(14, "JELLY BEANS", 1.35, ProductCategory.CANDY, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[2][0][2] = new Item(15, "SNICKERS BAR", 1.35, ProductCategory.CANDY, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[2][1][0] = new Item(16, "PEPPERMINTS", 1.35, ProductCategory.CANDY, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[2][1][1] = new Item(17, "JOLLY RANCHERS", 1.35, ProductCategory.CANDY, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[2][1][2] = new Item(18, "WARHEADS", 1.35, ProductCategory.CANDY, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");

        // Layer 3
        items[3][0][0] = new Item(19, "BBQ CHIPS", 1.50, ProductCategory.CHIPS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[3][0][1] = new Item(20, "SOUR CREAM AND ONION CHIPS", 1.50, ProductCategory.CHIPS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[3][0][2] = new Item(21, "VEGGIE CHIPS", 1.50, ProductCategory.CHIPS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[3][1][0] = new Item(22, "PITA CHIPS", 1.50, ProductCategory.CHIPS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[3][1][1] = new Item(23, "MAUI SWEET ONION CHIPS", 1.50, ProductCategory.CHIPS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[3][1][2] = new Item(24, "SALT AND VINEGAR CHIPS", 1.50, ProductCategory.CHIPS, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");

        // Layer 4
        items[4][0][0] = new Item(25, "CHOCOLATE CHIP COOKIE", 1.50, ProductCategory.COOKIES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[4][0][1] = new Item(26, "OATMEAL RAISIN COOKIE", 1.50, ProductCategory.COOKIES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[4][0][2] = new Item(27, "SNICKER DOODLE COOKIE", 1.50, ProductCategory.COOKIES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[4][1][0] = new Item(28, "GINGERBREAD COOKIE", 1.50, ProductCategory.COOKIES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[4][1][1] = new Item(29, "SHORTBREAD COOKIE", 1.50, ProductCategory.COOKIES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");
        items[4][1][2] = new Item(30, "SUGAR COOKIE", 1.50, ProductCategory.COOKIES, "\n Calories: 135\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 10 grams");

        // Layer 5
        items[5][0][0] = new Item(31, "SRIRACHA POPCORN", 2.99, ProductCategory.POPCORN, "\n Calories: 250\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 2 grams");
        items[5][0][1] = new Item(32, "DILL PICKLE POPCORN", 2.99, ProductCategory.POPCORN, "\n Calories: 250\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 2 grams");
        items[5][0][2] = new Item(33, "BUFFALO WING POPCORN", 2.99, ProductCategory.POPCORN, "\n Calories: 250\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 2 grams");
        items[5][1][0] = new Item(34, "CINNAMON SUGAR POPCORN", 2.99, ProductCategory.POPCORN, "\n Calories: 250\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 2 grams");
        items[5][1][1] = new Item(35, "TRUFFLE BUTTER POPCORN", 2.99, ProductCategory.POPCORN, "\n Calories: 250\n Total Fat: 9 Grams\n Sugars: 1 gram\n Protein: 2 grams");
        items[5][1][2] = new Item(36, "MAPLE BACON POPCORN", 2.99, ProductCategory.POPCORN, "\n Calories: 250\n Total Fat: 9 Grams\n Sugar: 300 grams\n Protein: 2 grams");


    }
    public Item[][][] getItems() {
        return items;
    }

    public Item getItemById(int productId) {
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 6; y++) {
                for (int z = 0; z < 6; z++) {
                    if (items[x][y][z] != null && items[x][y][z].getProductId() == productId) {
                        return items[x][y][z];
                    }
                }
            }
        }
        return null; // Item not found
    }



    // Other methods to interact with the inventory, such as checking totals, restocking, etc.
    // ...
}
