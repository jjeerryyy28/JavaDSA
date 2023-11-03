import java.util.Arrays;

public class Solution {
    static int modifyMex(int n, int[] a) {
        Arrays.sort(a);
        int score = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == score) {
                score++;
            } else if (a[i] > score) {
                count++;
                score = a[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example usage of modifyMex method
        int[] a1 = {0, 1, 2};
        int result1 = modifyMex(3, a1);
        System.out.println(result1); // Output should be 2

        int[] a2 = {6, 6, 6};
        int result2 = modifyMex(3, a2);
        System.out.println(result2); // Output should be 2
    }
}
