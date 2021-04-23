package leetcode.array;

public class SlidingWindowProblem {

    public static void main(String[] args) {
        SlidingWindowProblem slidingWindowProblem = new SlidingWindowProblem();
        System.out.println(slidingWindowProblem.maxSum(4, new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}));
    }

    public int maxSum(int k, int[] arr) {
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];

        int window_sum = max_sum;
        for (int i = k; i < arr.length; i++) {
            window_sum  += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;




    }
}
