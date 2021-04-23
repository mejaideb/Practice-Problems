package leetcode.array;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        longestCommonPrefix.findLongestCommonPrefix(new String[]{"flower", "flow", "flight"});
    }

    private String findLongestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        int n = minimumLengthOfString(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        String res = "";
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(k) == s2.charAt(k)) {
                res += s1.charAt(k);
                k++;
            } else
                break;
        }
        System.out.println(res);
        return res;
    }

    public int minimumLengthOfString(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for (String s : strs) {
            minLength = Math.min(minLength, s.length());
        }
        return minLength;
    }
}
