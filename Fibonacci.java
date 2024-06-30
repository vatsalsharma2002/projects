public class Fibonacci {

    public static long fibonacciIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }

    public static long fibonacciRecursive(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void main(String[] args) {
        int n = 100;
        long resultIterative = fibonacciIterative(n);
        System.out.println("Result for n=100: " + resultIterative);

    }
}
