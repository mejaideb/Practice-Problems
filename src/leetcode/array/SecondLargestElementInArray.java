package leetcode.array;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        SecondLargestElementInArray s = new SecondLargestElementInArray();
        s.findSecondLargestElementInAnArray(new int[]{34, 35, 1, 10, 34, 1});
    }

    private void findSecondLargestElementInAnArray(int[] arr) {
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int indexOfMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                indexOfMax = i;
        }
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[indexOfMax];
        arr[indexOfMax] = temp;
        for (int i = 0; i < arr.length - 1; i++) {
            secondMax = Math.max(secondMax, arr[i]);
        }
        System.out.println(secondMax);
    }
}
