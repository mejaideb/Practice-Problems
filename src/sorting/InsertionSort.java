package sorting;

import java.util.Arrays;

public class InsertionSort {

    private void insSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            var key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        sort.insSort(new int[]{23, 43, 55, 22, 55, 11, 3, 67});
    }
}
