import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String regex = ">(?<furniture>{2}[A-Z][a-z]+)<(?<price>{2}[\\d\\.]+)!(?<quantity>\\d)";
        String regex = "(?<furniture>[A-Za-z\\s]+)<<(?<price>\\d+(.\\d+)?)!(?<quantity>\\d+)";
        String input = sc.nextLine();
        List <String> furniture = new ArrayList<>();
        List <Double> price = new ArrayList<>();
        List <Integer> count = new ArrayList<>();

        while(!"Purchase".equals(input)){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                furniture.add(matcher.group("furniture"));
                price.add(Double.parseDouble(matcher.group("price")));
                count.add(Integer.parseInt(matcher.group("quantity")));
            }
            input = sc.nextLine();
        }
        double sum = 0.0;
        for (int i = 0; i < furniture.size(); i++){
            sum += price.get(i) * count.get(i);
        }
        System.out.println("Bought furniture:");
        for (String item:furniture) {
            System.out.println(item);
        }
        System.out.println(String.format("Total money spend: %.2f", sum));
    }
}
