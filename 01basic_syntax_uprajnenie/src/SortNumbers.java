import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int d = 0;
        boolean isTrue = false;

        while (isTrue == false){
            if (a < b){
                d = a;
                a = b;
                b = d;
            }
            if (b < c){
                d = b;
                b = c;
                c = d;
            }
            if (a < c){
                d = a;
                a = c;
                c = d;
            }
            if(a >= b && b >= c){
                isTrue = true;
            }
        }
        System.out.println(String.format("%d%n%d%n%d", a, b, c));
    }
}
