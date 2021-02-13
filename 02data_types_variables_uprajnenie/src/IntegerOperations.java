import java.math.BigInteger;
import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger first = new BigInteger(sc.nextLine());
        BigInteger second = new BigInteger(sc.nextLine());
        BigInteger sum = first.add(second);
        BigInteger third = new BigInteger(sc.nextLine());
        sum = sum.divide(third);
        BigInteger fourth = new BigInteger(sc.nextLine());
        sum = sum.multiply(fourth);

        System.out.println(sum);
    }
}
