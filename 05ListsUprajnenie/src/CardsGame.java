import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static List <Integer> readDeck(Scanner scan){
         return Arrays.stream(scan.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
    }
    public static void printResult (List<Integer> deckFirst, List<Integer> deckSecond){
        if (deckFirst.size() > deckSecond.size()){
            int sum = 0;
            for (Integer integer : deckFirst) {
                sum += integer;
            }
            System.out.println(String.format("First player wins! Sum: %d",sum));
        }
        else if (deckSecond.size() > deckFirst.size()){
            int sum = 0;
            for (Integer integer : deckSecond) {
                sum += integer;
            }
            System.out.println(String.format("Second player wins! Sum: %d",sum));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> deckFirst = readDeck(sc);
        List<Integer> deckSecond = readDeck(sc);

        while(deckFirst.size() != 0 && deckSecond.size() != 0) {
                if (deckFirst.get(0) > deckSecond.get(0)) {
                    deckFirst.add(deckFirst.get(0));
                    deckFirst.add(deckSecond.get(0));
                    deckFirst.remove(0);
                    deckSecond.remove(0);
                } else if (deckSecond.get(0) > deckFirst.get(0)) {
                    deckSecond.add(deckSecond.get(0));
                    deckSecond.add(deckFirst.get(0));
                    deckSecond.remove(0);
                    deckFirst.remove(0);
                } else if (deckFirst.get(0).equals(deckSecond.get(0))){
                    deckFirst.remove(0);
                    deckSecond.remove(0);
                }
        }
        printResult(deckFirst, deckSecond);
    }
}
