package leetcode.array;

import java.util.Arrays;

/*Missing smallest positive number-AMAZON*/
public class MissingNumber1 {
    public static void main(String[] args) {
        MissingNumber1 m = new MissingNumber1();
        System.out.println(m.findSmallestMissingNumber(new int[]{3, 4, 7, 1}));
    }

    private int findSmallestMissingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currentPos = arr[i] - 1;
            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[arr[i] - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }
}
