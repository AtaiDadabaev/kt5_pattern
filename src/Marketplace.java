public class Marketplace {
    public static void main(String[] args) {
        ProductCategory electronics = ProductCategoryFactory.getCategory("Electronics");
        ProductCategory books = ProductCategoryFactory.getCategory("Books");
        ProductCategory electronicsAgain = ProductCategoryFactory.getCategory("Electronics");

        Product product1 = new Product("Smartphone", electronics);
        Product product2 = new Product("Laptop", electronics);
        Product product3 = new Product("Novel", books);

        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();

        System.out.println("Are both electronics categories the same object? " + (electronics == electronicsAgain));
    }
}
