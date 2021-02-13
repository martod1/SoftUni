import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input1 = sc.nextLine().split(" ");
        String [] input2 = sc.nextLine().split(" ");
        int [] arr1 = new int[input1.length];
        int [] arr2 = new int[input2.length];

        for (int i = 0; i < arr1.length; i++){
            arr1 [i] = Integer.parseInt(input1 [i]);
        }
        for (int i = 0; i < arr2.length; i++){
            arr2 [i] = Integer.parseInt(input2[i]);
        }
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (j < arr1.length || j < arr2.length){
            sum1 += arr1[j];
            sum2 += arr2[j];
            if (arr1[j] != arr2[j]){
                System.out.println(String.format("Arrays are not identical. Found difference at %d index.", j));
                break;
            }
            j++;
        }
        if (sum1 == sum2) {
            System.out.println(String.format("Arrays are identical. Sum: %d",sum1));
        }
    }
}
