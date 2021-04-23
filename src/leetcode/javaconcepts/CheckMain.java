package leetcode.javaconcepts;

public class CheckMain {
    public static void main(String[] args) {
        CheckMain main1 = new CheckMain();
        main1.main((String) null);

    }

    public static void main(Object o) {
        System.out.println("Object method");
    }

    public static void main(String s) {
        System.out.println("string");
    }
}
