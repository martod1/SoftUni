import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input =sc.nextLine();
        double totalSum = 0;

        while (!input.equals("Start")) {
            double put = Double.parseDouble(input);
            if (put == 0.1) {
                totalSum += 0.1;
            } else if (put == 0.2) {
                totalSum += 0.2;
            } else if (put == 0.5) {
                totalSum += 0.5;
            } else if (put == 1) {
                totalSum += 1;
            } else if (put == 2) {
                totalSum += 2;
            }
            else {
                System.out.println(String.format("Cannot accept %.2f", Double.parseDouble(input)));
            }
            input =sc.nextLine();
        }

        double total = 0;

        while (!input.equals("End") && totalSum - total >= 0) {
            input =sc.nextLine();
            if ("Nuts".equals(input)) {
                total += 2;
                if (totalSum - total < 0){
                    total -= 2;
                    System.out.println("Sorry, not enough money");
                }
                else {
                    System.out.println("Purchased Nuts");
                }
            } else if ("Water".equals(input)) {
                total += 0.7;
                if (totalSum - total < 0){
                    total -= 0.7;
                    System.out.println("Sorry, not enough money");
                }
                else {
                    System.out.println("Purchased Water");
                }
            } else if ("Crisps".equals(input)) {
                total += 1.5;
                if (totalSum - total < 0){
                    total -= 1.5;
                    System.out.println("Sorry, not enough money");
                }
                else {
                    System.out.println("Purchased Crisps");
                }
            } else if ("Soda".equals(input)) {
                total += 0.8;
                if (totalSum - total < 0){
                    total -= 0.8;
                    System.out.println("Sorry, not enough money");
                }
                else {
                    System.out.println("Purchased Soda");
                }
            } else if ("Coke".equals(input)) {
                total += 1;
                if (totalSum - total < 0){
                    total -= 1;
                    System.out.println("Sorry, not enough money");
                }
                else {
                    System.out.println("Purchased Coke");
                }
            } else {
                if (!input.equals("End")) {
                    System.out.println("Invalid product");
                }
            }
        }

        System.out.println(String.format("Change: %.2f",totalSum-total));
    }
}
