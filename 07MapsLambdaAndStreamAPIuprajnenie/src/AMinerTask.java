import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap <String, Integer> resources = new LinkedHashMap<>();
        String input = sc.nextLine();
        while (!input.equals("stop")) {
            resources.putIfAbsent(input, 0);
            int quantity = Integer.parseInt(sc.nextLine());
            int currentQuantity = resources.get(input);
            resources.put(input, currentQuantity + quantity);
            input = sc.nextLine();
        }
        resources
                .entrySet()
                .stream()
                .forEach(resource -> System.out.println(String.format("%s -> %d",
                        resource.getKey(), resource.getValue())));
    }
}
