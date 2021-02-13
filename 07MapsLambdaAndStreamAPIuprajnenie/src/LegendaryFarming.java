import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap <String, Integer> items = new TreeMap<>(){{
            put("shards", 0);
            put("fragments", 0);
            put("motes", 0);
        }};
        TreeMap<String, Integer> junk =  new TreeMap<>();
        boolean isObtained = false;
        while (!isObtained){
            String [] tokens =sc.nextLine().split("\\s+");
            for (int i = 0; i < tokens.length; i += 2) {
                int currentCount = 0;
                int count = Integer.parseInt(tokens[i]);
                String type = tokens[i + 1].toLowerCase();
                if (items.containsKey(type)) {
                    currentCount = items.get(type);
                    items.put(type, currentCount + count);
                    if (items.get(type) >= 250) {
                        int values = items.get(type);
                        switch (type) {
                            case "shards":
                                items.put(type, values - 250);
                                System.out.println("Shadowmourne obtained!");
                                isObtained = true;
                                break;
                            case "fragments":
                                items.put(type, values - 250);
                                System.out.println("Valanyr obtained!");
                                isObtained = true;
                                break;
                            case "motes":
                                items.put(type, items.get(type) - 250);
                                System.out.println("Dragonwrath obtained!");
                                isObtained = true;
                                break;
                        }
                    }
                } else {
                    junk.putIfAbsent(type, 0);
                    currentCount = junk.get(type);
                    junk.put(type, currentCount + count);
                }
                if (isObtained) {
                    break;
                }
            }
        }
        items
                .entrySet()
                .stream()
                .sorted((i1, i2) -> Integer.compare(i2.getValue(), i1.getValue()))
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));
        junk
                .entrySet()
                .forEach(j -> System.out.println(String.format("%s: %d", j.getKey(), j.getValue())));
    }
}
