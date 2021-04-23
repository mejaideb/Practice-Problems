package leetcode.javaconcepts;

public class Java {
    public void Skills(){
        System.out.println("java");
    }
}
class Scala{
    public void Skills(){
        System.out.println("Scala");
    }
}

class Python{
    public void Skills(){
        System.out.println("Python");
    }
}
class  Main{
    public static void main(String[] args) {
        Java f1=new Java();
        Python f2=new Python();
        f1.Skills();
    }
}