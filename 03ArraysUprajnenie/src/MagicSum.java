import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.next());
        int j = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            j++;
            for (int count = j; count < array.length; count++){
                sum = array[i] + array[count];
                if (sum == n){
                    System.out.println(array[i] + " " +  array[count]);
                }
            }
        }
    }
}
