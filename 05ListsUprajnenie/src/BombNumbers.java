import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers =
                Arrays.stream(sc.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String [] tokens = sc.nextLine().split("\\s+");
        int specialNumber = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

        while (numbers.contains(specialNumber)) {
                int startIndex = numbers.indexOf(specialNumber) - power;
                int endIndex = numbers.indexOf(specialNumber) + power;
                if(startIndex < 0){
                    startIndex = 0;
                }
                if (endIndex >= numbers.size()){
                    endIndex = numbers.size() - 1;
                }
                for (int j = startIndex; j <= endIndex; j++) {
                    numbers.remove(startIndex);
                }
        }
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
