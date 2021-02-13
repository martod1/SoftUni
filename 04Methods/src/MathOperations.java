import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static double calculate (double n1,String command ,double n2){
        if ("/".equals(command)) {
           return n1 / n2;
        }
        else if ("*".equals(command)) {
            return n1 * n2;
        }
        else if ("+".equals(command)) {
            return n1 + n2;
        }
        else if ("-".equals(command)) {
            return n1 - n2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String operation = sc.nextLine();
        String input2 = sc.nextLine();
        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);

        System.out.println(new DecimalFormat("0.####").format(calculate(number1, operation, number2)));

    }
}
