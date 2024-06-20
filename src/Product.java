public class Product {
    private String name;
    private ProductCategory category;

    public Product(String name, ProductCategory category) {
        this.name = name;
        this.category = category;
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        category.displayCategory();
    }
}
