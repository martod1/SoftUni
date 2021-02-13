import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());
        int courses = 0;

        while (number > 0){
            number -= capacity;
            courses++;
        }
        System.out.println(courses);
    }
}
