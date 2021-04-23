package leetcode.array;

public class TrappingRainWater {
    public int maxArea(int[] height) {
        int result = 0;
        for (int i = 1; i < height.length; i++) {
            int leftMaximum = leftMax(height, height.length, i);
            int rightMaximum = rightMax(height, height.length, i);
            result = result + Math.min(leftMaximum, rightMaximum) - height[i];
        }
        return result;
    }

    public int leftMax(int[] height, int n, int i) {
        int maximum = 0;
        for (int j = 0; j <= i; j++) {
            maximum = Math.max(maximum, height[j]);
        }
        return maximum;
    }

    public int rightMax(int[] height, int n, int i) {
        int maximum = 0;
        for (int j = n - 1; j >= i; j--) {
            maximum = Math.max(maximum, height[j]);
        }
        return maximum;
    }

    public static void main(String[] args) {
        TrappingRainWater rainWater=new TrappingRainWater();
        System.out.println(rainWater.maxArea(new int[]{3,0,2,0,4}));
    }

}
