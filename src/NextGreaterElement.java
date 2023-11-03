import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 3, 5, 1, 4, 7, 2, 4, 5, 8};
        int[] output = nextGreaterElements(input);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
