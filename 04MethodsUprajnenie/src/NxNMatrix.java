import java.util.Scanner;

public class NxNMatrix {
    public static void NxN(int number){
        for (int j = 0; j < number; j++) {
            for (int i = 0; i < number; i++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        NxN(n);
    }
}
