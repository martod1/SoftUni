import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int [] reverse = new int[n];

        for (int i = 0; i < n; i++){
            reverse[i] =  Integer.parseInt(sc.nextLine());
        }
        for (int j = n - 1; j >= 0 ; j--){
            System.out.printf("%d ",reverse[j]);
        }
    }
}
