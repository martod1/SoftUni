import java.util.Scanner;

public class PrintingTriangle {
    public static void printLine(int number){
        for (int i = 1; i <= number; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(i);
        }
        for (int i = n - 1; i > 0; i--) {
            printLine(i);
        }
    }
//    public static void printTriangle2 (int number){
//        for (int i = number; i > 0; i--){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n = Integer.parseInt(input);

        printTriangle(n);
    }


}
