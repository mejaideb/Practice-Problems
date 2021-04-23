package leetcode.array;

public class PrintAllPairsOfGivenSum {
    public static void main(String[] args) {
        PrintAllPairsOfGivenSum p=new PrintAllPairsOfGivenSum();
        p.getAllPairs(new int[]{1, 5, 7, -1, 5}, 6);
    }

    private void getAllPairs(int[] a, int target) {
        int i=0;
        int j=a.length-1;
        while(i<j){
            if(a[i]+a[j]==target)
                System.out.print("("+a[i]+", "+a[j]+") ");
            if(a[i]+a[j]>target)
                j--;
            else
                i++;
        }
    }
}
