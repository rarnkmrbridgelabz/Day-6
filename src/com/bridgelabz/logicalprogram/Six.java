package Day6LogicalPrograms;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;

public class Six {
    public class Stopwatch {

        public static void main(String[] args) {

            Instant instantStarted = Instant.now();
            Fibonacci(40);
            Instant instantStopped = Instant.now();

            Duration durationBetween = Duration.between(instantStarted, instantStopped);

            System.out.println("Get elapsed time in milliseconds: " + durationBetween.toMillis());
            System.out.println("Get elapsed time in seconds: " + durationBetween.toSeconds());
            System.out.println("Get elapsed time in minutes: " + durationBetween.toMinutes());


        }

        private static BigInteger Fibonacci(int n) {
            if (n < 2)
                return BigInteger.ONE;
            else
                return Fibonacci(n - 1).add(Fibonacci(n - 2));
        }
    }
}
