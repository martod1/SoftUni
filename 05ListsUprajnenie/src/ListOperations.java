import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> operationsList =
                Arrays.stream(sc.nextLine().split("\\s+"))
                        .collect(Collectors.toList());

        String input = sc.nextLine();
        String [] tokens = input.split("\\s+");

        while (!"End".equals(input)){
            if ("Add".equals(tokens[0])){
                operationsList.add(tokens[1]);
            }
            else if ("Insert".equals(tokens[0])){
                if (operationsList.size() > Integer.parseInt(tokens[2]) && Integer.parseInt(tokens[2]) >= 0) {
                    operationsList.add(Integer.parseInt(tokens[2]), tokens[1]);
                }
                else {
                    System.out.println("Invalid index");
                }
            }
            else if ("Remove".equals(tokens[0])){
                if (operationsList.size() > Integer.parseInt(tokens[1]) && Integer.parseInt(tokens[1]) >= 0) {
                    operationsList.remove(Integer.parseInt(tokens[1]));
                }
                else {
                    System.out.println("Invalid index");
                }
            }
            else if ("Shift".equals(tokens[0]) && "left".equals(tokens[1])){
                int count = Integer.parseInt(tokens[2]);
                for (int i = 0; i < count; i++){
                    String newLast = operationsList.get(0);
                    operationsList.remove(0);
                    operationsList.add(newLast);
                }
            }
            else if ("Shift".equals(tokens[0]) && "right".equals(tokens[1])){
                int count = Integer.parseInt(tokens[2]);
                for (int i = 0; i < count; i++){
                    int index = operationsList.size() - 1;
                    String newFirst = operationsList.get(index);
                    operationsList.remove(index);
                    operationsList.add(0, newFirst);
                }
            }
            input = sc.nextLine();
            tokens = input.split("\\s+");
        }
        for (String element : operationsList){
            System.out.print(element + " ");
        }
    }
}
