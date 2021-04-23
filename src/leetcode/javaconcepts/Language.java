package leetcode.javaconcepts;

public class Language {
    public  String name;
}
class  Hack{
    public static void main(String[] args) {
        Language p=new Language();
        p.name="Ejava";
        func1(p);
        System.out.println(p.name);
        func2(p);
    }

    private static void func2(Language p) {
        p.name="Python";
        System.out.println(p.name);
    }

    private static void func1(Language p) {
        p = new Language();
        p.name="Angular";
        System.out.println(p.name);
    }

}
