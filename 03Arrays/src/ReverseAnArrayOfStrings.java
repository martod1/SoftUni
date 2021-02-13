import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = sc.nextLine().split(" ");
        int length = arr.length;
        String current = "";

        for (int i = 0; i < length; i++){
            current = arr[length - 1];
            arr[length-1]= arr[i];
            arr[i] = current;
            length--;
        }
        System.out.println(String.join(" ", arr));
    }
}
