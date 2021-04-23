package leetcode.array;

import java.util.HashSet;

public class PairInArrayWithGivenSumX {
    public static void main(String[] args) {
        PairInArrayWithGivenSumX p = new PairInArrayWithGivenSumX();
        p.findPairs(-2, new int[]{0, -1, 2, -3, 1});
    }

    private void findPairs(int sum, int[] arr) {
        //naive approach
//        int flag=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == sum) {
//                    System.out.println("("+arr[i]+ ", " +arr[j]+ ")");
//                    flag=1;
//                }
//            }
//        }
//        if(flag==0)
//            System.out.println("-1");
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];
            if (s.contains(temp)) {
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
            }
            s.add(arr[i]);
        }
    }
}

