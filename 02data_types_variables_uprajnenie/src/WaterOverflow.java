import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int capacity = 255;
        int currentCapacity = 0;

        for (int i = 0; i < n; i++){
            int input = Integer.parseInt(sc.nextLine());
             currentCapacity += input;
            if (currentCapacity > capacity){
                currentCapacity -= input;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentCapacity);
    }
}
