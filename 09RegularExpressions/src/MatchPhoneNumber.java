import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "\\+359([\\- ])2(\\1)[\\d]{3}(\\1)[\\d]{4}\\b";
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(input);

        List<String> matchedPhones = new ArrayList<>();

        while (phoneMatcher.find()){
            matchedPhones.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", matchedPhones));
    }
}
