import java.util.Scanner;

public class Calculations {
    public static  void  calculateNumbers(String com, int num1, int num2){
        if ("add".equals(com)){
            System.out.println(num1 + num2);
        }
        else if ("multiply".equals(com)){
            System.out.println(num1 * num2);
        }
        else if ("subtract".equals(com)){
            System.out.println(num1 - num2);
        }
        else if ("divide".equals(com)){
            System.out.println(num1 / num2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        String input1 = sc.nextLine();
        int number1 = Integer.parseInt(input1);
        String input2 = sc.nextLine();
        int number2 = Integer.parseInt(input2);

        calculateNumbers(command, number1, number2);
    }
}
