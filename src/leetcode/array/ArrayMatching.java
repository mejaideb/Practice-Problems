package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayMatching {

    public static List<String> stringMatching(String[] words) {

        List<String> output = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < words.length; j++)
                if (words[j].contains(word) && !words[j].equals(word)) {
                    output.add(word);
                    break;
                }
        }
        System.out.println(output);
        return output;

    }

    public static void main(String[] args) {
        ArrayMatching matching = new ArrayMatching();
        stringMatching(new String[]{"mass", "as", "hero", "superhero"});
    }
}
