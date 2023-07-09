public class problem2 {
    public static double calculateAverage(int n, int[] arr) {
    int sum = 0; // Initialize sum to 0

    for (int i = 0; i < n; i++) {
        sum += arr[i]; // Add each element to the sum
    }

    double average = (double) sum / n; // Calculate the average as sum divided by the number of elements

    return average;
}

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 1, 32, 3, 45};
        double average = calculateAverage(n, arr);
        System.out.println(average); // Output: 18.2
    }
}
