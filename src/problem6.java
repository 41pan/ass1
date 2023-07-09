public class problem6 {
    public static double calculateExponent(double a, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return a * calculateExponent(a, n - 1);
        } else {
            return 1 / (a * calculateExponent(a, -n - 1));
        }
    }

}
