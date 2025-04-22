import java.util.*;

public class PrimeRange {

    public static Set<Integer> sieveOfEratosthenes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int num = 2; num * num <= limit; num++) {
            if (isPrime[num]) {
                for (int multiple = num * num; multiple <= limit; multiple += num) {
                    isPrime[multiple] = false;
                }
            }
        }

        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void printPrimes(int start, int end) {
        Set<Integer> primes = sieveOfEratosthenes(end);
        for (int i = start; i <= end; i++) {
            if (primes.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(10, 50); // Example usage
    }
}
