import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Height: ");
        double height = Double.parseDouble(scanner.nextLine());
        double volume = (length + width + height) / 3;
        System.out.println(String.format("Pyramid Volume: %.2f", volume));

    }
}
