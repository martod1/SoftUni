import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String regex = "^%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>[-+]?[0-9]*\\.?[0-9]+)\\$";
        Pattern pattern = Pattern.compile(regex);
        double output = 0.0;
        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double total = count * price;
                output += total;
                System.out.printf("%s: %s - %.2f%n",customer, product, total);
            }
            input = sc.nextLine();
        }
        System.out.printf("Total income: %.2f%n", output);
    }
}
