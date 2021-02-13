import java.util.Scanner;

public class Orders {
    public static void printOrder(String productOrdered, double amount){
        double order = 0;
        if ("coffee".equals(productOrdered)){
            order = amount * 1.50;
            System.out.println(String.format("%.2f", order));
        }
        else if ("water".equals(productOrdered)){
            order = amount * 1.00;
            System.out.println(String.format("%.2f", order));
        }
        else if ("coke".equals(productOrdered)){
            order = amount * 1.40;
            System.out.println(String.format("%.2f", order));
        }
        else if ("snacks".equals(productOrdered)){
            order = amount * 2.00;
            System.out.println(String.format("%.2f", order));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String input = sc.nextLine();
        int quantity = Integer.parseInt(input);

        printOrder(product, quantity);
    }
}
