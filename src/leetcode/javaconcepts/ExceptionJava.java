package leetcode.javaconcepts;

public class ExceptionJava {

    //whaterver happens except the system crash or network faiure finally will always execute
    //but in this case catch wont return anything so only finally will give result
    public static void main(String[] args) {
        ExceptionJava j=new ExceptionJava();
        System.out.println(j.getResult());
    }

    private int getResult() {
        try{
            throw new Exception("abc");
        } catch (Exception e) {
            return 4;
        }
        finally {
            return 5;
        }
    }
}
