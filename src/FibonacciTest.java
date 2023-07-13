import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void testFibonacci() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));

        assertEquals(0, Fibonacci.fibonacci_1(0));
        assertEquals(1, Fibonacci.fibonacci_1(1));
        assertEquals(1, Fibonacci.fibonacci_1(2));
        assertEquals(2, Fibonacci.fibonacci_1(3));
        assertEquals(3, Fibonacci.fibonacci_1(4));
        assertEquals(5, Fibonacci.fibonacci_1(5));

        assertEquals(0, Fibonacci.fibonacci_2(0));
        assertEquals(1, Fibonacci.fibonacci_2(1));
        assertEquals(1, Fibonacci.fibonacci_2(2));
        assertEquals(2, Fibonacci.fibonacci_2(3));
        assertEquals(3, Fibonacci.fibonacci_2(4));
        assertEquals(5, Fibonacci.fibonacci_2(5));
        // Add more test cases as needed
    }
}

