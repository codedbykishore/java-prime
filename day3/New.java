
import java.math.BigInteger;

public class New {

    public static BigInteger factorial(int n) {
        if (n <= 1)
            return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        int num = 192;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

}
