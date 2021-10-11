import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr= new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]= scan.nextInt();
        }
        for (int i=0; i<(arr.length/2); i++) {
            int temp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int value: arr){
            System.out.print(value + " ");
        }
    }
}