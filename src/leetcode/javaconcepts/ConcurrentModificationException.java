package leetcode.javaconcepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(90);
        l.add(40);
//        System.out.println("Original List " + l);
//        addElementsForFailFast(l); // throw ConcurrentModificationException
        addElementsForFailSafe(l);

    }

    private static void addElementsForFailSafe(Collection<Integer> newInteger) {
        List<Integer> newList = new ArrayList<>(newInteger);
        newInteger.stream().map(marks -> {
            Iterator<Integer> iterator = newInteger.iterator();
            if (marks < 30) {
                Integer next = iterator.next();
                newList.add(next + 10);
            }
            return null;
        }).forEach(System.out::println);
//        System.out.println(newList);
    }

    private static void addElementsForFailFast(Collection<Integer> newInteger) {
        for (Integer marks : newInteger) {
            if (marks < 30)
                newInteger.add(40);
        }
    }
}
