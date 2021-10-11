import java.util.Scanner;

public class MaxCounterSolC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int max= arr[0];
        int counter= 0;
        for (int i = 1; i<n; i++){
            if (max<arr[i]){
                max= arr[i];
            }
        }
        for (int i = 0; i<n; i++){
            if (max== arr[i]){
                counter++;
            }
        }
        System.out.println(max+ " "+ counter);
    }
}
