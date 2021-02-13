import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] n = sc.nextLine().split(" ");
        int length = n.length;
        int number = 0;
        int sum_even = 0;
        int sum_odd = 0;

        for (int i =0; i < length; i++){
            number = Integer.parseInt(n[i]);
            if (number % 2 == 0){
                sum_even += number;
            }
            else {
                sum_odd += number;
            }
        }
        System.out.println(sum_even - sum_odd);

    }
}
