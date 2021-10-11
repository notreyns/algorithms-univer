import java.util.Arrays;
import java.util.Scanner;

public class ReverseTwoPartsOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < (arr.length / 4); i++) {
                int temp = arr[i];
                arr[i] = arr[n/2 - 1 - i];
                arr[n/2 - 1 - i] = temp;
            int temp2 = arr[i+n/2];
            arr[n/2+i] = arr[n - 1 - i];
            arr[n- 1 - i] = temp2;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }


    }
}
