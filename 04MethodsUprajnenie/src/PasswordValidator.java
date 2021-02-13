import java.util.Scanner;

public class PasswordValidator {
    public static boolean validatePassword(String pass){
        boolean isEnough = includes6to10Characters(pass);
        boolean containsOnlyDigitsAndLetters = consistsLettersAndDigits(pass);
        boolean haveAtLeast2Digits = haveAtLeast2Digits(pass);
        boolean isValid = isEnough && containsOnlyDigitsAndLetters && haveAtLeast2Digits;
        return isValid;
    }
    public static boolean includes6to10Characters(String pass){
        if (pass.length() >= 6 && pass.length() <= 10){
           return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }

    }
    public static boolean consistsLettersAndDigits(String pass){
        for (int i = 0; i < pass.length(); i++){
            char symbol = pass.charAt(i);
            if (!Character.isLetterOrDigit(symbol)){
                System.out.println("Password must consist only of letters and digits");
                return false;
            }

        }
        return true;
    }
    public static boolean haveAtLeast2Digits(String pass){
        int counter = 0;
        for (int i = 0; i < pass.length(); i++){
            char character = pass.charAt(i);
            if (Character.isDigit(character)){
                counter++;
            }
            if (counter == 2){
                return true;
            }

        }
        System.out.println("Password must have at least 2 digits");
        return  false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        boolean isPasswordCorrect = validatePassword(password);
        if (isPasswordCorrect){
            System.out.println("Password is valid");
        }

    }
}
