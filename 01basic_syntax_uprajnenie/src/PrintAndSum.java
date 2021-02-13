import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startNumber = Integer.parseInt(sc.nextLine());
        int endNumber = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (; startNumber <= endNumber ;startNumber++){
            sum += startNumber;
            System.out.printf("%d ",startNumber);
        }
        System.out.println(String.format("%nSum: %d",sum));
    }
}
