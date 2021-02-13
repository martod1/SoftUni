import java.util.Scanner;

public class PalindromeIntegers {
    public static void palindrome(){
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        String output = "";
        while (!"END".equals(command)) {
            for (int i = command.length() - 1; i >= 0; i--) {
                output += command.charAt(i);
            }
            if (output.equals(command)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            output = "";
            command = sc.nextLine();
        }
    }

    public static void main(String[] args) {
        palindrome ();
    }
}
