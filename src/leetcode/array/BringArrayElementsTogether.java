package leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BringArrayElementsTogether {
    public static void main(String[] args) {
        BringArrayElementsTogether b = new BringArrayElementsTogether();
        b.bringArrayElementsTogether(new int[]{3, 4, 5, 2, 2, 5, 2, 4});
    }

    private void bringArrayElementsTogether(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i]))
                map.put(a[i], map.get(a[i]) + 1);
            else
                map.put(a[i], 1);
        }
        System.out.println(map);
        int c = 0;
        for (int i = 0; i < a.length / 2; i++) {
            Integer k = map.get(a[i]);
            while (k != 0) {
                arr[c++] = a[i];
                k--;
                if (k == 0)
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
