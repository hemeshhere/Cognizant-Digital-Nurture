import java.util.Arrays;

public class EcommerceSearchTest {

    // LINEAR SEARCH IMPLEMENTATION
    // Time Complexity: O(n)
    public static Product linearSearch(Product[] catalog, int targetId) {
        for (Product p : catalog) {
            if (p.getProductId() == targetId) {
                return p;
            }
        }
        return null; // Product not found
    }

    // BINARY SEARCH IMPLEMENTATION
    // Time Complexity: O(log n)
    // PRECONDITION: The catalog array MUST be sorted by productId
    public static Product binarySearch(Product[] catalog, int targetId) {
        int low = 0;
        int high = catalog.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents integer overflow
            
            if (catalog[mid].getProductId() == targetId) {
                return catalog[mid];
            } else if (catalog[mid].getProductId() < targetId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Product not found
    }

    public static void main(String[] args) {
        // An array of products
        Product[] catalog = {
            new Product(502, "Wireless Mouse", "Electronics"),
            new Product(105, "Mechanical Keyboard", "Electronics"),
            new Product(899, "Ergonomic Chair", "Furniture"),
            new Product(230, "Standing Desk", "Furniture"),
            new Product(411, "USB-C Hub", "Accessories")
        };

        int targetId = 230;

        System.out.println("E-Commerce Search Execution");

        // Execute Linear Search 
        System.out.println("\nExecuting Linear Search for ID " + targetId + "...");
        Product foundLinear = linearSearch(catalog, targetId);
        System.out.println("Result: " + (foundLinear != null ? foundLinear : "Not Found"));

        // 3. Execute Binary Search
        // MUST sort the array first 
        Arrays.sort(catalog); 
        System.out.println("\nCatalog sorted. Executing Binary Search for ID " + targetId + "...");
        Product foundBinary = binarySearch(catalog, targetId);
        System.out.println("Result: " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}