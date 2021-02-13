import java.util.Scanner;

public class CalculateRectangleArea {
    public static int calculateRectangleArea(int w, int l){
        return w * l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int width = Integer.parseInt(input1);
        int length = Integer.parseInt(input2);

        int area = calculateRectangleArea(width, length);
        System.out.println(area);
    }
}
