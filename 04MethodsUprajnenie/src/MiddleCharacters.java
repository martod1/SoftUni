import java.util.Scanner;

public class MiddleCharacters {
    public static void middleCharacters(String in){
        int newLength = in.length() / 2;
        if (in.length() % 2 == 0) {
            System.out.print(in.charAt(newLength - 1));
        }
        System.out.print(in.charAt(newLength));
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        middleCharacters(input);
    }
}
