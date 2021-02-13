import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> listIntegers =
                Arrays.stream(sc.nextLine().split("\\s+"))
                        .collect(Collectors.toList());

        String input = sc.nextLine();
        String [] tokens = input.split("\\s+");

        while (!"end".equals(input)){
            if ("Delete".equals(tokens[0])){
                while (listIntegers.contains(tokens[1])){
                    listIntegers.remove(tokens[1]);
                }
            }
            else if ("Insert".equals(tokens[0])){
                String element = tokens[1];
                int index = Integer.parseInt(tokens[2]);
                if (index < listIntegers.size()) {
                    listIntegers.add(index, element);
                }
            }
            input = sc.nextLine();
            tokens = input.split("\\s+");
        }
        System.out.println(String.join(" ", listIntegers));
    }
}
