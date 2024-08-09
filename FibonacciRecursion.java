public class FibonacciRecursion {

    public int solveUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int ans = solveUsingRecursion(n - 1) + solveUsingRecursion(n - 2);
        return ans;
    }

    public static void main(String[] args) {
        FibonacciRecursion fib = new FibonacciRecursion();
        int n = 10;  // Example value
        System.out.println("Fibonacci number at position " + n + " is: " + fib.solveUsingRecursion(n));
    }
}
