package ecommerce;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Phone", "Electronics"),
            new Product(5, "Bag", "Fashion")
        };

        // -------- LINEAR SEARCH ----------
        System.out.println("Linear Search Result:");
        Product result1 = SearchEngine.linearSearch(products, "Watch");
        System.out.println(result1 != null ? result1 : "Product not found");

        // -------- BINARY SEARCH ----------
        // Sort array before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search Result:");
        Product result2 = SearchEngine.binarySearch(products, "Watch");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
