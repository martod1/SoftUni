import java.util.Scanner;

public class RepeatString {
    public  static  String printNTimes(String input, int counter){
        String result = "";
        for (int i = 0; i < counter; i++){
            result += input;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1  = sc.nextLine();
        String input2 = sc.nextLine();
        int count = Integer.parseInt(input2);

       String result = printNTimes(input1, count);
       System.out.println(result);
    }
}
