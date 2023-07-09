public class MinimumFinder {
    public static int findMinimum(int n, int[] arr) {
        int minimum = Integer.MAX_VALUE; // Initialize minimum to maximum integer value

        for (int i = 0; i < n; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        return minimum;
    }
}
