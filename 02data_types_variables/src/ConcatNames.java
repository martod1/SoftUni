import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String addition = sc.nextLine();

        System.out.println(name1+addition+name2);
    }
}
