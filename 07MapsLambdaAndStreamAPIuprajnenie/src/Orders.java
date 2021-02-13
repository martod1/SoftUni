import java.util.LinkedHashMap;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String, Double> products = new LinkedHashMap<>();
        LinkedHashMap <String, Integer> productsQuantity = new LinkedHashMap<>();

        String [] tokens = sc.nextLine().split("\\s+");
        String command = tokens[0];
        int quantity = 0;

        while (!"buy".equals(command)){
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int currentQuantity = Integer.parseInt(tokens[2]);
            if (!products.containsKey(product)){
                productsQuantity.put(product, currentQuantity);
                double sum = price * currentQuantity;
                products.put(product, sum);
            }
            else {
                productsQuantity.put(product, productsQuantity.get(product) + currentQuantity);
                double sum = price * productsQuantity.get(product);
                products.put(product, sum);
            }
            tokens = sc.nextLine().split("\\s+");
            command = tokens[0];
        }
        products
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println(String.format("%s -> %.2f",
                        entry.getKey(), entry.getValue())));
    }
}
