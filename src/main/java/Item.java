public class Item {

    private int productId;
    private String name;

    private ProductCategory category;

    private double price;
    private String nutritionalFacts;

    public Item(int productId, String name, double price, ProductCategory category, String nutritionalFacts) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.nutritionalFacts = nutritionalFacts;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getNutritionalFacts() {
        return nutritionalFacts;
    }
}
