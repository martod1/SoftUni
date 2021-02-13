import java.util.Arrays;
import java.util.Scanner;

public class WarShips {
    private static boolean isIndexValid(int index, int[] arr) {
        return index >= 0 && index < arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pirateShip = Arrays.stream(sc.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] warShip = Arrays.stream(sc.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxHealthCapacity = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();
        while (!input.equals("Retire")) {

            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Fire": {
                    int index = Integer.parseInt(tokens[1]);
                    int damage = Integer.parseInt(tokens[2]);
                    if (isIndexValid(index, warShip)) {
                        if ((warShip[index] -= damage) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                }
                break;
                case "Defend": {
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    int damage = Integer.parseInt(tokens[3]);
                    if (isIndexValid(startIndex, pirateShip) && isIndexValid(endIndex, pirateShip)) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            if ((pirateShip[i] -= damage) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                }
                break;
                case "Repair": {
                    int index = Integer.parseInt(tokens[1]);
                    int health = Integer.parseInt(tokens[2]);
                    if (isIndexValid(index, pirateShip)) {
                        pirateShip[index] = Math.min(maxHealthCapacity, pirateShip[index] + health);
                    }
                }
                break;
                case "Status": {
                    System.out.print(String.format("%d sections need repair.%n",
                            Arrays.stream(pirateShip)
                                    .filter(section -> section < maxHealthCapacity * 0.20).count()));
                }
                break;
            }
            input = sc.nextLine();
        }

        System.out.print(String.format("Pirate ship status: %d%n", Arrays.stream(pirateShip).sum()));
        System.out.print(String.format("Warship status: %d%n", Arrays.stream(warShip).sum()));
    }
}