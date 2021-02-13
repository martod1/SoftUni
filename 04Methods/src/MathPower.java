import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static double raiseNumber(double number, int pow){
        double result = 1;
        for (int i = 1; i <= pow; i++){
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        double value = Double.parseDouble(input1);
        int power = Integer.parseInt(input2);

        System.out.println(new DecimalFormat("0.####").format(raiseNumber(value, power)));

    }
}
