import java.util.ArrayList;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> guestList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String input = sc.nextLine();
            String [] tokens = input.split("\\s+", 2);

            if (tokens[1].equals("is going!")){
                if (guestList.contains(tokens[0])){
                    System.out.println(String.format("%s is already in the list!", tokens[0]));
                }
                else {
                    guestList.add(tokens[0]);
                }
            }
            else if (tokens[1].equals("is not going!")){
                if (guestList.contains(tokens[0])){
                    guestList.remove(tokens[0]);
                }
                else {
                    System.out.println(String.format("%s is not in the list!", tokens[0]));
                }
            }
        }

        for (String guest : guestList) {
            System.out.println(guest);
        }
    }

}
