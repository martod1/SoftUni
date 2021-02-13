import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        String pass = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            pass = pass + username.charAt(i);
        }

        String password = sc.nextLine();
        boolean isLogged = false;

        for (int j= 0; j < 3; )
        if (password.equals(pass)){
            isLogged = true;
            System.out.println(String.format("User %s logged in.", username));
            break;
        }
        else {
            System.out.println("Incorrect password. Try again.");
            password = sc.nextLine();
            j++;
        }

        if (isLogged == false){
            System.out.printf("User %s blocked!",username);
        }
    }
}
