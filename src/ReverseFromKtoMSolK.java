import java.util.Scanner;

/*Реверс массива – это перестановка элементов в обратном порядке: меняются местами первый и последний элементы, второй и
 предпоследний и т.д. Напишите программу, которая выполняет реверс части массива, начиная с элемента с номером K и
 заканчивая элементом с номером M (включительно). Нумерация элементов массива начинается с единицы.

Входные данные
  Первая строка содержит размер массива N . Во второй строке через пробел задаются N чисел – элементы массива.
  Гарантируется, что 0 < N ≤ 10000 . В третьей строке через пробел записаны два числа – K ( 0 < K ≤ N ) и M ( K ≤ M ≤ N ).
Выходные данные
   Программа должна вывести в одну строчку все элементы получившегося массива, разделив их пробелами.*/
public class ReverseFromKtoMSolK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int K = scan.nextInt();
        int M = scan.nextInt();
        for (int i =0; i <(M-K+1)/2; i++) {
            int temp = arr[K-1+i];
            arr[K-1+i] = arr[M-1-i];
            arr[M-1-i] = temp;
        }
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

