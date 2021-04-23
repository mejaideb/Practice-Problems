package leetcode.number;

public class NPrimeNumber {
    public static void main(String[] args) {
        NPrimeNumber n = new NPrimeNumber();
        n.checkPrimeNumbersPresentInGivenRange(13);
    }

    private void checkPrimeNumbersPresentInGivenRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    private boolean isPrime(int number) {
        int flag = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = 1;
                return false;
            }
        }
        if (flag == 0)
            return true;
        else
            return false;

    }
}
