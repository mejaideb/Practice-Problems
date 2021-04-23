package leetcode.javaconcepts;

class HackerEarth {

    public void m1(double m) {
        System.out.println("Inside hackerEarth" + m);
    }
}

class Hacker extends HackerEarth {
    public void m1(int m) {
        System.out.println("Inside hackr" + m);
    }
}

class HackMain {
    public static void main(String[] args) {
        HackerEarth h = new Hacker();
        h.m1(10);
    }
}
