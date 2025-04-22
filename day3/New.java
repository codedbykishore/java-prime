import java.math.BigInteger;

public class New {

    public static BigInteger factorial(int n) {
        if (n <= 1)
            return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 5000;
        // System.out.println("Factorial of " + num + " is: " + factorial(num));
        System.out.println("TrailingZero is " + trailingZeroes(num));
    }

}
