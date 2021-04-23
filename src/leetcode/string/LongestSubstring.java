package leetcode.string;

import java.util.*;

public class LongestSubstring  {

    private int substring(String s) {

        int right = 0;
        int left = 0;
        int result = 0;

        HashSet<Character> hs = new HashSet<>();
        while (right < s.length()) {
            if (hs.contains(s.charAt(right))) {
                hs.remove(s.charAt(left++));
            } else {
                hs.add(s.charAt(right++));
                result = Math.max(result, hs.size());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        LongestSubstring substring = new LongestSubstring();
        substring.substring("abcabcbb");
    }
}
