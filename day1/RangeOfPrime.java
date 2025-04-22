import java.util.*;

public class RangeOfPrime {
  public static void main(String[] args) {
    int n = 100;

    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);

    isPrime[0] = false;
    isPrime[1] = false;

    for (int num = 2; num * num <= n; num++) {
      if (isPrime[num]) {
        for (int multiple = num * num; multiple <= n; multiple += num) {
          isPrime[multiple] = false;
        }
      }
    }

    for (int i = 2; i <= n; i++) {
      if (isPrime[i]) {
        System.out.println(i);
      }
    }
  }
}
