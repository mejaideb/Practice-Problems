package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {


    public static void main1(String[] args) {
        MergeSort sort = new MergeSort();
        int[] array = {23, 43, 34, 11, 35, 1, 78, 2, 34, 99};
        sort.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            var leftArray = Arrays.copyOfRange(arr, 0, mid);
            var rightArray = Arrays.copyOfRange(arr, mid, arr.length);
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(arr, leftArray, rightArray);
        }
    }

    private void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i += 1;
            } else {
                arr[k] = rightArray[j];
                j += 1;
            }
            k += 1;
        }
        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i += 1;
            k += 1;
        }
        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j += 1;
            k += 1;
        }
    }
}
