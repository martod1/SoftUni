import java.util.Scanner;

public class AddAndSubtract {
    public static int sum (int number1, int number2){
        return number1 + number2;
    }
    public static int subtract (int sum, int number3){
        return sum - number3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        int sumation = sum(num1, num2);
        int result =  subtract(sumation, num3);
        System.out.println(result);



    }
}
