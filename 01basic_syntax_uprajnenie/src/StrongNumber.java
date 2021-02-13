import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int factorialSum = 0;

        for (int i = 0; i < input.length(); i++){
            int currentSum = 1;
            int digit= Integer.parseInt("" + input.charAt(i));
            for (int j = 1; j <= digit; j++){
                currentSum *= j;
            }
            factorialSum += currentSum;
        }
        if(Integer.parseInt(input) == factorialSum) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
