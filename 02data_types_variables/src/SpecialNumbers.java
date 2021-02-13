import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++){
            int currentNum = i;
            int sum = 0;
            while (currentNum > 0){
                sum = sum + currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;

            if (isSpecial){
                System.out.println(String.format("%d -> True", i));
            }
            else {
                System.out.println(String.format("%d -> False", i));
            }
        }
    }
}
