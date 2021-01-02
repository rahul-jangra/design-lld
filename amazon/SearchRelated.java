public interface Search {
  public List<Product> searchProductsByName(String name);
  public List<Product> searchProductsByCategory(ProductCategory productCategory);
}
 
public class SearchProducts implements Search {
   HashMap<String, List<Product>> productNames;
   HashMap<ProductCategory, List<Product>> productCategories;
 
  public List<Product> searchProductsByName(String name) {
    return productNames.get(name);
  }
 
  public List<Product> searchProductsByCategory(ProductCategory productCategory) {
    return productCategories.get(category);
  }
}
 