import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        while (!"end".equals(word)){
            String reversed = "";
            for (int i = word.length() - 1; i >= 0; i--){
                reversed += word.charAt(i) + "";
            }
            System.out.println(String.format("%s = %s",  word, reversed));
            word = sc.nextLine();
        }
    }
}
