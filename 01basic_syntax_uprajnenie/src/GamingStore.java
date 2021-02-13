import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalSum = Double.parseDouble(sc.nextLine());;
        double total = 0;
        String input = "";

        do {
            input =sc.nextLine();
            if ("OutFall 4".equals(input)) {
                total += 39.99;
                if (totalSum - total < 0){
                    total -= 39.99;
                    System.out.println("Too Expensive");
                }
                else {
                    System.out.println("Bought OutFall 4");
                }
            } else if ("CS: OG".equals(input)) {
                total += 15.99;
                if (totalSum - total < 0){
                    total -= 15.99;
                    System.out.println("Too Expensive");
                }
                else {
                    System.out.println("Bought CS: OG");
                }
            } else if ("Zplinter Zell".equals(input)) {
                total += 19.99;
                if (totalSum - total < 0){
                    total -= 19.99;
                    System.out.println("Too Expensive");
                }
                else {
                    System.out.println("Bought Zplinter Zell");
                }
            } else if ("Honored 2".equals(input)) {
                total += 59.99;
                if (totalSum - total < 0){
                    total -= 59.99;
                    System.out.println("Too Expensive");
                }
                else {
                    System.out.println("Bought Honored 2");
                }
            } else if ("RoverWatch".equals(input)) {
                total += 29.99;
                if (totalSum - total < 0){
                    total -= 29.99;
                    System.out.println("Too Expensive");
                }
                else {
                    System.out.println("Bought RoverWatch");
                }

            } else if ("RoverWatch Origins Edition".equals(input)) {
                total += 39.99;
                if (totalSum - total < 0){
                    total -= 39.99;
                    System.out.println("Too Expensive");
                }
                else {
                    System.out.println("Bought RoverWatch Origins Edition");
                }

            } else {
                if (!input.equals("Game Time")) {
                    System.out.println("Not Found");
                }
            }
        }
        while (!input.equals("Game Time") && totalSum - total >= 0);

        if (totalSum > total){
            System.out.println(String.format("Total spent: $%.2f. Remaining: $%.2f", total, totalSum-total));
        }
        else {
            System.out.println("Out of money!");
        }
    }
}
