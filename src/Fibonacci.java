public class Fibonacci {
    private static int[] memo;
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacci_1(int n) {
        if (n <= 1) {
            return n;
        }

        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }


    public static int fibonacci_2(int n) {
        memo = new int[n + 1];
        return fibonacciHelper(n);
    }

    private static int fibonacciHelper(int n) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibonacciHelper(n - 1) + fibonacciHelper(n - 2);
        return memo[n];
    }

}

