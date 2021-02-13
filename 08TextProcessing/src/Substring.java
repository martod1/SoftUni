import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = false;
        String wordToRemove = sc.nextLine();
        String input = sc.nextLine();
        while (!isTrue){
            if (input.contains(wordToRemove)){
                int toRemoveIndex = input.indexOf(wordToRemove);
                int length = input.length();
                input = input.substring(0, toRemoveIndex)
                        + input.substring(toRemoveIndex + wordToRemove.length(), length);
            }
            else{
                isTrue = true;
            }
        }
        System.out.println(input);
    }
}
