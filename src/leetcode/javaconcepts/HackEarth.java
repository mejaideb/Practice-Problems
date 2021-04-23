package leetcode.javaconcepts;

public interface HackEarth {

    public void work();

    class NoWork implements HackEarth {
        private NoWork() {
            System.out.println("No coding in java");
        }

        public void work() {
            System.out.println("code in java");
        }
    }

    HackEarth obj = new NoWork();
}

class Main1 {
    public static void main(String[] args) {
        getWork(HackEarth.obj);
    }

    private static void getWork(HackEarth obj) {
        obj.work();
    }
}
