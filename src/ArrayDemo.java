import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int idx=0; idx<n; idx++){
            arr[idx] = scanner.nextInt();
        }
        scanner.close();
        System.out.print(Arrays.toString(arr));
    }
}
