package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (frequency.containsKey(nums[i])) {
                int c = frequency.get(nums[i]);
                System.out.println(c);
                frequency.put(nums[i], c + 1);
            } else
                frequency.put(nums[i], 1);
        }
        System.out.println(frequency);
        for (Integer ele : nums) {
            if (frequency.get(ele) > (nums.length / 2))
                return ele;
        }
        return 0;
    }

    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        m.majorityElement(new int[]{3, 2, 3});
    }
}
