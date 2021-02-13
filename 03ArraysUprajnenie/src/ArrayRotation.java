import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = sc.nextLine().split(" ");
        int n = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < n; j++) {
            String current = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
             arr [arr.length-1] = current;
        }

        System.out.println(String.join(" ", arr));
    }
}
