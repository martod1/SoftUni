import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        String[] day = new String[]{"Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        if (input > 0 && input <= 7){
            input = input - 1;
            System.out.println(day[input]);
        }
        else {
            System.out.println("Invalid day!");
        }
    }
}
