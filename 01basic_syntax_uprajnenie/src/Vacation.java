import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countGroup = Integer.parseInt(sc.nextLine());
        String typeGroup = sc.nextLine();
        String day = sc.nextLine();
        double sum = 0;

        if (typeGroup.equals("Students")){
            switch (day){
                case "Friday":
                    sum = countGroup * 8.45;
                    if (countGroup >= 30){
                        System.out.println(String.format("Total price: %.2f", (sum * 0.85)));
                    }
                    else{
                        System.out.println(String.format("Total price: %.2f", sum));
                    }
                    break;
                case "Saturday":
                    sum = countGroup * 9.80;
                    if (countGroup >= 30){
                        System.out.println(String.format("Total price: %.2f", (sum * 0.85)));
                    }
                    else{
                        System.out.println(String.format("Total price: %.2f", sum));
                    }
                    break;
                case "Sunday":
                    sum = countGroup * 10.46;
                    if (countGroup >= 30){
                        System.out.println(String.format("Total price: %.2f", (sum * 0.85)));
                    }
                    else{
                        System.out.println(String.format("Total price: %.2f", sum));
                    }
                    break;
            }
        }
        else if (typeGroup.equals("Business")) {
            switch (day) {
                case "Friday":
                sum = countGroup * 10.90;
                if (countGroup >= 100) {
                    System.out.println(String.format("Total price: %.2f", (sum - (10 * (sum / countGroup)))));
                }
                else {
                    System.out.println(String.format("Total price: %.2f", sum));
                }
                break;
                case "Saturday":
                    sum = countGroup * 15.60;
                    if (countGroup >= 100){
                        System.out.println(String.format("Total price: %.2f", (sum - (10*(sum / countGroup)))));
                    }
                    else {
                        System.out.println(String.format("Total price: %.2f", sum));
                    }
                    break;
                case "Sunday":
                    sum = countGroup * 16.00;
                    if (countGroup >= 100){
                        System.out.println(String.format("Total price: %.2f", (sum - (10*(sum / countGroup)))));
                    }
                    else {
                        System.out.println(String.format("Total price: %.2f", sum));
                    }
                    break;
            }
        }
        else if (typeGroup.equals("Regular")) {
            switch (day) {
                case "Friday":
                    sum = countGroup * 15.00;
                    if (countGroup >= 10 && countGroup <= 20){
                        System.out.println(String.format("Total price: %.2f", (sum * 0.95)));
                    }
                    else {
                        System.out.println(String.format("Total price: %.2f", sum));
                    }
                    break;
                case "Saturday":
                    sum = countGroup * 20.00;
                    if (countGroup >= 10 && countGroup <= 20){
                        System.out.println(String.format("Total price: %.2f", (sum * 0.95)));
                    }
                    else {
                        System.out.println(String.format("Total price: %.2f", sum));
                    }
                    break;
                case "Sunday":
                    sum = countGroup * 22.50;
                    if (countGroup >= 10 && countGroup <= 20){
                        System.out.println(String.format("Total price: %.2f", (sum * 0.95)));
                    }
                    else {
                        System.out.println(String.format("Total price: %.2f", sum));
                    }
                    break;
            }
        }
    }
}
