import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1;

        while (number % 2 != 0){
            number = Integer.parseInt(sc.nextLine());
            if (number % 2 != 0){
                System.out.println("Please write an even number.");
            }
        }
        System.out.printf("The number is: %d", Math.abs(number));
    }
}
