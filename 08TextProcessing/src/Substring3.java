import java.util.Scanner;

public class Substring3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordToRemove = sc.nextLine();
        String input = sc.nextLine();
        while (input.contains(wordToRemove)){
            if (input.contains(wordToRemove)){
                int toRemoveIndex = input.indexOf(wordToRemove);
                int length = input.length();
                input = input.substring(0, toRemoveIndex)
                        + input.substring(toRemoveIndex + wordToRemove.length(), length);
            }
        }
        System.out.println(input);
    }
}
