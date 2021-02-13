import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String pass = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            pass = pass + username.charAt(i);
        }
        System.out.println(pass);
    }
}
