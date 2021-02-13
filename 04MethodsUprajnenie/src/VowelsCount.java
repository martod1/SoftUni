import java.util.Scanner;

public class VowelsCount {
    public static int countVowels(String in){
        int counter = 0;
        for (int i = 0; i < in.length(); i++){
             char character = in.toLowerCase().charAt(i);

             switch(character){
                 case 'a':
                 case 'e':
                 case 'i':
                 case 'o':
                 case 'u':
                     counter++;
                     break;
             }
         }
        return counter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int output = countVowels(input);
        System.out.println(output);
    }
}
