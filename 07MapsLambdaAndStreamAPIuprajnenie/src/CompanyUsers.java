import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        TreeMap <String, ArrayList<String>> companies = new TreeMap<>();

        while (!"End".equals(input)){
            String [] tokens = input.split(" -> ");
            String company = tokens[0];
            String employee = tokens[1];
            companies.putIfAbsent(company, new ArrayList<>());
            if (!companies.get(company).contains(employee)){
                companies.get(company).add(employee);
            }

            input = sc.nextLine();
        }
        for (var entry : companies.entrySet()) {
            System.out.println(entry.getKey());
            for (String id : entry.getValue()) {
                System.out.println("-- "+ id);
            }
        }
    }
}
