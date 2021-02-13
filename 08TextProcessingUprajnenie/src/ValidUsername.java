import java.util.Scanner;

public class ValidUsername {
    public static boolean isValidPass (String input){
        if (input.length() < 3 || input.length() > 16){
            return false;
        }
        for (int i = 0; i < input.length(); i++){
            char current = input.charAt(i);
            if (!Character.isLetterOrDigit(current) && current != '-' && current != '_'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] tokens = input.split(", ");

        for (String token : tokens) {
            if (isValidPass(token)) {
                System.out.println(token);
            }
        }
    }
}
