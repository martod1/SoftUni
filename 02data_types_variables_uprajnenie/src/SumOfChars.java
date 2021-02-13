import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while (n > 0){
            int letter = sc.next().charAt(0);
            sum += letter;
            n--;
        }
        System.out.println(String.format("The sum equals: %d", sum));
    }
}
