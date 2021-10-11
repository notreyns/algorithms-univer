import java.util.Scanner;
//greatest common divisor using euclidean algorithm
public class GCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result= gcd(a, b);
        System.out.println(result);

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
