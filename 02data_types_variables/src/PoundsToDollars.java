import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = Double.parseDouble(sc.nextLine());
        double result = num * 1.31;

        System.out.printf("%.3f",result);
    }
}
