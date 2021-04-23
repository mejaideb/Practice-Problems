package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class TwoMissingNumbers {
    public static void main(String[] args) {
        TwoMissingNumbers num = new TwoMissingNumbers();
        num.findMissingNumbers(new int[]{1, 2}, 4);
    }

    private void findMissingNumbers(int[] a, int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            l.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            if (!l.contains(i + 1)) {
                System.out.println(i + 1);
            }

        }
    }
}
