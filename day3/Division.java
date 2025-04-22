import java.util.*;

public class Division {
  public int divide(int dividend, int divisor) {
    if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
    int sign = ((dividend > 0) == (divisor > 0)) ? 1 : -1;

    long n = Math.abs((long) dividend);
    long d = Math.abs((long) divisor);

    int ans = 0;
    while (n >= d) {
      int p = 0;
      while (n >= (d << p)) {
        p++;
      }
      p--;
      n -= (d << p);
      ans += (1 << p);
    }

    return ans * sign;
  }
}
