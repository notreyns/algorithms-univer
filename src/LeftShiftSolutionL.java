import java.util.Scanner;

public class LeftShiftSolutionL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int d= scan.nextInt();
        int gcd= gcd(n, d);
        for (int i = 0; i< gcd; i++){
            int temp = arr[i];
            int j = i;
            while(true){

                int step = j+d;
                if(step>= n){
                    step = step - n;
                }
                if(step == i){
                    break;
                }
                arr[j] = arr[step];
                j= step;
            }
            arr[j]= temp;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static int gcd(int a, int b) {
        int max = a;
        int min = b;
        int result = 1;
        if(b> a){
            max= b;
            min = a;
        }
        if( max% min ==0 || (min == 0 )) {
            result=  min;
        }else{
            int reminder= max% min;
            result = gcd(min,reminder);
        }
        return result;
    }
}

