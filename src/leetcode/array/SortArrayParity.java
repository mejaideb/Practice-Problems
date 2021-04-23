package leetcode.array;

import java.util.Arrays;

public class SortArrayParity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        int temp = 0;

        while (i < j) {
            if (A[j] % 2 == 0) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i++;
                j--;
            } else if (A[i] % 2 == 0) {
                i++;
                j--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        SortArrayParity s = new SortArrayParity();
        System.out.println(Arrays.toString(s.sortArrayByParity(new int[]{1, 3})));
    }
}
