import java.util.Scanner;

public class GreaterOfTwoValues {
    public static int getMax(int first, int second){
        if (first > second){
            return first;
        }
        return second;
    }
    public static char getMax(char first, char second){
        if (first > second){
            return first;
        }
        return second;
    }

    public static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        if ("int".equals(type)) {
            String input1 = sc.nextLine();
            String input2 = sc.nextLine();
            int number1 = Integer.parseInt(input1);
            int number2 = Integer.parseInt(input2);
            System.out.println(getMax(number1, number2));
        }
        else if ("char".equals(type)){
            char input1 = sc.next().charAt(0);
            char input2 = sc.next().charAt(0);
            System.out.println(getMax(input1, input2));
        }
        else if ("string".equals(type)){
            String input1 = sc.nextLine();
            String input2 = sc.nextLine();
            System.out.println(getMax(input1, input2));
        }

    }
}
