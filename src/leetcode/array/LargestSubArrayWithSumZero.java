package leetcode.array;

import java.util.HashMap;

public class LargestSubArrayWithSumZero {
    public static void main(String[] args) {
//        LargestSubArrayWithSumZero subArrayWithSumZero = new LargestSubArrayWithSumZero();
//        subArrayWithSumZero.findLargestSubArrayWithSumZero(new int[]{1, -1, 3, 2, -2, -8, 1, 7, 10, 23});
    }

    /*
     * store in map sum and its index so that when next time same sum occurs we get to know in which
     * index the same sum so if same sum is occuring two time that means in between  there might me sum that makes it zero
     * */
    private void findLargestSubArrayWithSumZero(int[] a) {
        String s="flower";
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            if (sum == 0) {
                max = i + 1;
            } else {
                if (map.get(sum) != null) {
                    max = Math.max(max, i - map.get(sum));
                } else
                    map.put(sum, i);
            }
        }

        System.out.println(max);
    }
}
