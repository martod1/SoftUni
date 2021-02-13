import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static int printSmallestInteger(int n1, int n2, int n3){
        if (n1 <= n2 && n1 <= n3){
            return n1;
        }
        else if (n2 <= n3 && n2 <= n1){
            return n2;
        }
        return n3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();

        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);
        int number3 = Integer.parseInt(input3);

        System.out.println(printSmallestInteger(number1, number2, number3));
    }
}
