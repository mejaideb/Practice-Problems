package leetcode.javaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//asked in enquero accquired by Genpact
public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeIfDuplicateFound("aabcdbc");
    }

    private void removeIfDuplicateFound(String s) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(20);
        System.out.println(list);

        var l=list.stream().distinct().collect(Collectors.toList());
        System.out.println(l);

    }
}



















