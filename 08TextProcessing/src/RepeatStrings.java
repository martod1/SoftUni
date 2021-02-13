import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] words = sc.nextLine().split("\\");
        StringBuilder result = new StringBuilder();

        for (String word : words){
            int count = word.length();
            for (int i = 0; i < count; i++){
                result.append(word);
            }
        }
        System.out.println(result);
    }
}
