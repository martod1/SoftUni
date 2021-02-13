import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int biscuitsPerWorker = Integer.parseInt(sc.nextLine());
        int countOfWorkers = Integer.parseInt(sc.nextLine());
        int productionOfRival = Integer.parseInt(sc.nextLine());

        int totalProduction = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                totalProduction += (int)((biscuitsPerWorker * countOfWorkers) * 0.75);
            } else {
                totalProduction += biscuitsPerWorker * countOfWorkers;
            }
        }
        System.out.println(String.format("You have produced %d biscuits for the past month.", totalProduction));
        if (totalProduction > productionOfRival){
            totalProduction -= productionOfRival;
            double result = totalProduction * 1.0/productionOfRival*100;
            System.out.println(String.format("You produce %.2f percent more biscuits.", result));
        }
        else if (totalProduction < productionOfRival){
            totalProduction -= productionOfRival;
            double result = Math.abs(totalProduction*1.0/productionOfRival*100);
            System.out.println(String.format("You produce %.2f percent less biscuits.", result));
        }
    }
}
