import java.util.HashMap;
import java.util.Map;

public class ProductCategoryFactory {
    private static final Map<String, ProductCategory> categories = new HashMap<>();

    public static ProductCategory getCategory(String name) {
        ProductCategory category = categories.get(name);
        if (category == null) {
            category = new ConcreteProductCategory(name);
            categories.put(name, category);
        }
        return category;
    }
}
