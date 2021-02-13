import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double biggest = 0;
        String currentKeg = "";
        String model = "";

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            model = sc.nextLine();
            double radius = Double.parseDouble(sc.nextLine());
            int height = Integer.parseInt(sc.nextLine());
            double volume = 3.14159265359 * radius * radius * height ;

            if (volume > biggest){
                biggest = volume;
                currentKeg = model;
            }
        }
        System.out.println(currentKeg);

    }
}
