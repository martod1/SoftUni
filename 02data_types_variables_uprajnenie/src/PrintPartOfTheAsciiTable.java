import java.util.Scanner;

public class PrintPartOfTheAsciiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());


        while (n <= p){
            char c = (char)n;
            System.out.print(String.format(" %c",c));
            n ++;
        }
    }
}
