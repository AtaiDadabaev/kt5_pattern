public class ConcreteProductCategory implements ProductCategory {
    private String name;

    public ConcreteProductCategory(String name) {
        this.name = name;
    }

    @Override
    public void displayCategory() {
        System.out.println("Product Category: " + name);
    }

    public String getName() {
        return name;
    }
}
