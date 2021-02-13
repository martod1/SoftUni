import java.util.ArrayList;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split("\\|");
        ArrayList<String> result = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--){
            String [] arr = input[i].trim().split("\\s+");
            for (String element : arr) {
                result.add(element);
            }
            result.remove("");
        }
        System.out.println(String.join(" ", result));
    }
}
