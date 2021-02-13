import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayType = sc.nextLine().toLowerCase();
        int age = Integer.parseInt(sc.nextLine());

        if (dayType.equals("weekday")) {
            if (age >= 0 && age <= 18) {
                System.out.println(12 + "$");
            }else if (age > 18 && age <= 64) {
                System.out.println(18 + "$");
            }else if (age > 64 && age <= 122) {
                System.out.println(12 + "$");
            }else{
                System.out.println("Error!");
            }
        } else if (dayType.equals("weekend")) {
            if (age >= 0 && age <= 18) {
                System.out.println(15 + "$");
            }else if (age > 18 && age <= 64) {
                System.out.println(20 + "$");
            }else if (age > 64 && age <= 122) {
                System.out.println(15 + "$");
            }else{
                System.out.println("Error!");
            }
        }else if (dayType.equals("holiday")) {
            if (age >= 0 && age <= 18) {
                System.out.println(5 + "$");
            }else if (age > 18 && age <= 64) {
                System.out.println(12 + "$");
            }else if (age > 64 && age <= 122) {
                System.out.println(10 + "$");
            }else{
                System.out.println("Error!");
            }
        }else{
            System.out.println("Error!");
        }
    }
}
