public interface Search {
  public List<Product> searchProductsByName(String name);
  public List<Product> searchProductsByCategory(ProductCategory productCategory);
}
 

/**
Search strategy keeps evolving, if in future we have better ways to do the search, we can use that
*/ 
public class SearchProductsByMap implements Search {
   Map<String, List<Product>> productNames;
   Map<ProductCategory, List<Product>> productCategories;
 
  public List<Product> searchProductsByName(String name) {
    return productNames.get(name);
  }
 
  public List<Product> searchProductsByCategory(ProductCategory productCategory) {
    return productCategories.get(category);
  }
}
 