import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int i = Integer.parseInt(sc.nextLine());

        do {
            int result = i * number;
            System.out.printf("%d X %d = %d%n",number, i, result);
            i++;
        }
        while (i < 11);
    }
}
