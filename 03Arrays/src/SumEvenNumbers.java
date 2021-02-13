import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] n = sc.nextLine().split(" ");
        int length = n.length;
        int current = 0;
        int sum = 0;

        for (int i =0; i < length; i++){
           current = Integer.parseInt(n[i]);
           if (current % 2 == 0){
               sum += current;
           }
        }
        System.out.println(sum);

    }
}
