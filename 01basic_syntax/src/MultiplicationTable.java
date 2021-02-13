import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int i=1;

        while (i < 11){
            int result = i * number;
            System.out.printf("%d X %d = %d%n",number, i, result);
            i++;
        }
    }
}
