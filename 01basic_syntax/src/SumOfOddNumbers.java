import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 1;
        int odd = 1;
        System.out.println(odd);

        for (int i= 1; i < n; i++) {
            odd += 2;
            sum += odd;
            System.out.println(odd);
        }
        System.out.printf("Sum: %d", sum);
    }
}
