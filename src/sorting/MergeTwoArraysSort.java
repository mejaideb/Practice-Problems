package sorting;

import java.util.Arrays;

public class MergeTwoArraysSort {
    public static void main(String[] args) {
        MergeTwoArraysSort m = new MergeTwoArraysSort();
        m.sortTwoArrays(new int[]{4, 8, 3, 1, 9, 2}, new int[]{9, 4, 2, 5, 1, 8});
    }

    private void sortTwoArrays(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length) {
            arr[k] = left[i];
            i += 1;
            k += 1;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j += 1;
            k += 1;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}