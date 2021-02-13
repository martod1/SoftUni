import java.util.Scanner;

public class FactorialDivision {
    public static void factorial(double n1, double n2){
        double factorial1 = 1;
        for (int i = 1; i <= n1; i++) {
            factorial1 *= i;
        }
        double factorial2 = 1;
        for (int j = 1; j <= n2; j++){
            factorial2 *= j;
        }
        double factorial = factorial1 / (factorial2 * 1.0);
        System.out.println(String.format("%.2f", factorial));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1 = Integer.parseInt(sc.nextLine());;
        double number2 = Integer.parseInt(sc.nextLine());
        factorial(number1, number2);
    }
}
