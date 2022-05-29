package element;

public class Product {

    private String name;
    private String color;
    private String category;
    private int stock;
    private double weight;
    private String description;

    private Product() {

    }

    public static Product create(String name, String color, String category, int stock, double weight, String description) {
        Product product = new Product();
        product.setName(name);
        product.setColor(color);
        product.setCategory(category);
        product.setStock(stock);
        product.setWeight(weight);
        product.setDescription(description);
        return product;
    }

    public boolean isStockAvailableForOrder() {
        return this.stock > 0;
    }

    public void decreaseStock() {
        this.stock -= 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print() {
        String print = "name : " + name +
                "\tcolor : " + color +
                "\tcategory : " + category +
                "\tstock : " + stock +
                "\tweight : " + weight +
                "\tdescription : " + description;
        System.out.println(print);
    }
}
