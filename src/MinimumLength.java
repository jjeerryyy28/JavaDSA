import java.util.Scanner;

public class MinimumLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for (int j = 0; j < n; j++) {
                arr1[j] = scanner.nextInt();
            }

            for (int j = 0; j < n; j++) {
                arr2[j] = scanner.nextInt();
            }

            int result = minSubarrayLengthToEqualizeArrays(arr1, arr2);

            System.out.println(result);
        }
    }

    public static int minSubarrayLengthToEqualizeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int left = 0;

        while (left < n && arr1[left] == arr2[left]) {
            left++;
        }

        int right = n - 1;

        while (right >= 0 && arr1[right] == arr2[right]) {
            right--;
        }

        // Calculate the remaining length.

        return (right - left + 1);
    }
}
