import java.util.Scanner;

public class Substring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = false;
        String wordToRemove = sc.nextLine();
        String input = sc.nextLine();
        String [] result = {};
        while (!isTrue){
            if (input.contains(wordToRemove)){
                result = input.split(wordToRemove);
                input = String.join("",result);
            }
            else{
                isTrue = true;
            }
        }
        System.out.println(input);
    }
}
