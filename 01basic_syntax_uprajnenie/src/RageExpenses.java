import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //•	On the first input line - lost games count – integer in the range [0, 1000].
    //•	On the second line – headset price - floating point number in range [0, 1000].
    //•	On the third line – mouse price - floating point number in range [0, 1000].
    //•	On the fourth line – keyboard price - floating point number in range [0, 1000].
    //•	On the fifth line – display price - floating point number in range [0, 1000].

        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        double headsetCost = (lostGamesCount / 2) * headsetPrice;
        double mouseCost = (lostGamesCount / 3) * mousePrice;
        double keyboardCost = (lostGamesCount / 6) * keyboardPrice;
        double displayCost = (lostGamesCount / 12) * displayPrice;
        double totalCost = headsetCost + mouseCost + keyboardCost + displayCost;

        System.out.println(String.format("Rage expenses: %.2f lv.", totalCost));
    }
}
