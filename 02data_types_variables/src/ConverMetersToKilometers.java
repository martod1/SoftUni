import java.util.Scanner;

public class ConverMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meters = Integer.parseInt(sc.nextLine());

        double kilometers = meters / 1000.0;

        System.out.println(String.format("%.2f",kilometers));
    }
}
