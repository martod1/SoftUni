import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> train =
                Arrays.stream(sc.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int maxWagonSize = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();
        String[] tokens = input.split("\\s+");

        while (!"end".equals(input)) {
            if ("Add".equals(tokens[0])) {
                train.add(Integer.parseInt(tokens[1]));
            } else {
                for (int i = 0; i < train.size(); i++) {
                    int wagonSize = train.get(i) + Integer.parseInt(input);
                    if (wagonSize <= maxWagonSize) {
                        train.set(i, wagonSize);
                        break;
                    }
                }
            }
            input = sc.nextLine();
            tokens = input.split(" ");
        }
        for (int wagon : train) {
            System.out.print(wagon + " ");
        }
    }
}

