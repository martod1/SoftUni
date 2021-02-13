import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListManipulator {
    private static boolean isValidIndex(ArrayList<String> friends, int index) {
        return 0 <= index && index < friends.size();
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        String [] names = sc.nextLine().split(",\\s+");
        ArrayList<String> friendsList = new ArrayList<>(Arrays.asList(names));
        int blacklistCount = 0;
        int lostNamesCount = 0;

        String input = sc.nextLine();
        while (!"Report".equals(input)) {
            String [] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Blacklist": {
                    String name = tokens[1];
                    if (friendsList.contains(name)) {
                        int indexName = friendsList.indexOf(name);
                        friendsList.set(indexName, "Blacklisted");
                        System.out.println(String.format("%s was blacklisted.", name));
                        blacklistCount++;
                    } else {
                        System.out.println(String.format("%s was not found.", name));
                    }
                    break;
                }
                case "Error": {
                    int index = Integer.parseInt(tokens[1]);
                    String currentName = friendsList.get(index);
                    if (!currentName.equals("Blacklisted") && !currentName.equals("Lost")) {
                        friendsList.set(index, "Lost");
                        lostNamesCount++;
                        System.out.println(String.format("%s was lost due to an error.", currentName));
                    }
                    break;
                }
                case "Change": {
                    int index = Integer.parseInt(tokens[1]);
                    String newName = tokens[2];
                    if (isValidIndex(friendsList, index)) {
                        String currentName = friendsList.get(index);
                        friendsList.set(index, newName);
                        System.out.println(String.format("%s changed his username to %s.", currentName, newName));
                    }
                    break;
                }
            }
            input = sc.nextLine();
        }

        System.out.println(String.format("Blacklisted names: %d", blacklistCount));
        System.out.println(String.format("Lost names: %d", lostNamesCount));

        for (String friend : friendsList) {
            System.out.print(friend + " ");
        }
    }
}