package leetcode.array;

import java.util.Arrays;

public class RightGreatestElement {

    public int[] replaceElements(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int maxRightFromCurrentIndex = findMaxRightFromCurrentIndex(arr, i, n);
//            arr[i] = maxRightFromCurrentIndex;
//        }
//        arr[n - 1] = -1;
//        return arr;
//
//    }
//
//    public int findMaxRightFromCurrentIndex(int[] arr, int index, int n) {
//        int maximum = 0;
//        for (int j = n - 1; j > index; j--) {
//            maximum = Math.max(maximum, arr[j]);
//        }
//        return maximum;
        int n = arr.length;
        int max, k = 0;
        for (int i = n - 1; i > 0; i--) {
            max = Math.max(k, arr[i]);
            k = arr[i - 1];
            arr[i - 1] = max;
        }
        arr[n - 1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        RightGreatestElement r = new RightGreatestElement();
        System.out.println(Arrays.toString(r.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }
}
