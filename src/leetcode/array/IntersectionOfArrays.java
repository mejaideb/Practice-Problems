package leetcode.array;

import java.util.HashMap;
import java.util.*;

public class IntersectionOfArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, String> map = new HashMap<>();

        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();

        int n1 = nums1.length;
        int n2 = nums2.length;
        int size = 0;
        if (n1 < n2) {
            size = n1;
            map.put(size, "nums1");
        } else {
            size = n2;
            map.put(size, "nums2");
        }
        if (map.get(size).equals("nums1")) {

            for (int i = 0; i < nums2.length; i++) {
                l.add(nums2[i]);
            }
            for (int j = 0; j < size; j++) {
                if (l.contains(nums1[j])) {
                    l1.add(l.get(j));
                }
                l1.add(l.get(j));
            }
            int[] newArray = new int[l1.size()];
            for (int i = 0; i < l1.size(); i++) {
                newArray[i] = l1.get(i);
            }
            return newArray;

        } else if (map.get(size).equals("nums2")) {
            for (int i = 0; i < nums1.length; i++) {
                l.add(nums1[i]);

            }
            for (int j = 0; j < size; j++) {
                if (l.contains(nums2[j])) {
                    l1.add(l.get(j));
                }
                l1.add(l.get(j));
            }
            int[] newArray = new int[l1.size()];
            for (int i = 0; i < l1.size(); i++) {
                newArray[i] = l1.get(i);
            }

            return newArray;
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        IntersectionOfArrays i = new IntersectionOfArrays();
        i.intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }
}
