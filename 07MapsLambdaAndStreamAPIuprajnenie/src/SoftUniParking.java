import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap <String, String> database = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++){
            String [] input = sc.nextLine().split("\\s+");
            String command = input[0];
            String name = input[1];

            switch(command){
                case "register":
                    String plateNumber = input[2];
                    if (!database.containsKey(name)){
                        database.put(name, plateNumber);
                        System.out.println(String.format("%s registered %s successfully", name, plateNumber));
                    } else{
                        System.out.println(String.format(
                                "ERROR: already registered with plate number %s", database.get(name)));
                    }
                    break;
                case "unregister":
                    if (database.containsKey(name)){
                        database.remove(name);
                        System.out.println(String.format("%s unregistered successfully", name));
                    } else{
                        System.out.println(String.format("ERROR: user %s not found", name));
                    }
                    break;
            }
        }
        database
                .entrySet()
                .stream()
                .forEach(e -> System.out.println(String.format("%s => %s",
                        e.getKey(), e.getValue())));
    }
}
