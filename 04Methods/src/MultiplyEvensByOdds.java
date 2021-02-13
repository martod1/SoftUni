import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static int getSum (int input){
        input = Math.abs(input);
        int integer = 0;
        int modulus = 0;
        int sumEven = 0;
        int sumOdd = 0;

        while (input > 0) {
           integer = input / 10;
           modulus = input % 10;
           input = integer;
           if (modulus % 2 == 0){
               sumEven += modulus;
           }
           else {
               sumOdd += modulus;
           }
        }
        return sumEven * sumOdd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int numbers = Integer.parseInt(input);
        System.out.println(getSum(numbers));
    }
}
