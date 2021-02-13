import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        if (input != input.toLowerCase()){
            System.out.println("upper-case");
        }
        if (input != input.toUpperCase()){
            System.out.println("lower-case");
        }
    }
}
