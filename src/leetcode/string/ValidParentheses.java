package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    public boolean isValid(String s) {
        String[] sSplit = s.split("");
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        int c = 0, sq = 0, curl = 0;
        int k = 0;
        while (i < sSplit.length) {
            switch (sSplit[i]) {
                case "(":
                    c += 1;
                    i++;
                    break;
                case ")":
                    c -= 1;
                    i++;
                    break;
                case "[":
                    sq += 1;
                    i++;
                    break;
                case "]":
                    sq -= 1;
                    i++;
                    break;
                case "{":
                    curl += 1;
                    i++;
                    break;
                case "}":
                    curl -= 1;
                    i++;
                    break;
            }
        }
        return c == 0 && sq == 0 && curl == 0;
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        boolean valid = vp.isValid("([)]");
        System.out.println("is Valid : " + valid);
    }
}
