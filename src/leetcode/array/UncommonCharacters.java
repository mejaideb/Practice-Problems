package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UncommonCharacters {
    public static void main(String[] args) {
        UncommonCharacters uncommonCharacters = new UncommonCharacters();
        uncommonCharacters.printUncommonCharacters("geeksforgeeks", "geeksquiz");
    }

    private void printUncommonCharacters(String s1, String s2) {
        String[] p = s1.split("");
        String[] q = s2.split("");
        HashSet<String> set = new HashSet<>();
        for (String s : p) {
            if (!s2.contains(s))
                set.add(s);
        }
        for (String s : q) {
            if (!s1.contains(s))
                set.add(s);
        }
        System.out.println(set);
    }
}
