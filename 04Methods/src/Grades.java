import java.util.Scanner;

public class Grades {
    public static void printGrade(double inputGrade){
        if (inputGrade >= 2.00 && inputGrade <= 2.99){
            System.out.println("Fail");
        }
        else if (inputGrade >= 3.00 && inputGrade <= 3.49){
            System.out.println("Poor");
        }
        else if (inputGrade >= 3.50 && inputGrade <= 4.49){
            System.out.println("Good");
        }
        else if (inputGrade >= 4.50 && inputGrade <= 5.49){
            System.out.println("Very good");
        }
        else {
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double grade = Double.parseDouble(input);

        printGrade(grade);
    }
}
