package leetcode.array;

import java.util.Arrays;

public class SmallestSumOfSubArray {
    public static void main(String[] args) {
        SmallestSumOfSubArray smallestSumOfSubArray = new SmallestSumOfSubArray();
        System.out.println(smallestSumOfSubArray.smallestSubArray(6, new int[]{40, 2, 5, 10, 20, 1}));
    }

    private int smallestSubArray(int n, int[] a) {
        Arrays.sort(a);
        // After sorting --> 1,2,5,10,20,40
        int res = 1;//minimum sum can be 1 only so res is 1
        for (int i = 0; i < n; i++) {
            if (a[i] <= res)
                res += a[i];
        }
        return res;
    }
}
