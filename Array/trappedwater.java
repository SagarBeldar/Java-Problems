package Array;

public class trappedwater {

    static int trappedRainwater(int height[]) {
        int n = height.length;
        // left max boundary
        int leftheight[] = new int[n];
        leftheight[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftheight[i] = Math.max(height[i], leftheight[i - 1]);
        }
        // right max boundary

        int rightheight[] = new int[n];
        rightheight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightheight[i] = Math.max(height[i], rightheight[i + 1]);
        }
        // loop
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftheight[i], rightheight[i]);
            //formula 
            trappedwater += waterlevel - height[i];

        }
        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));

    }
}
