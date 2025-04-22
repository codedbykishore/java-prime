public class Factorial {

  public static long factorial(long n) {
    if (n <= 1)
      return 1;
    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    long num = 50;
    System.out.println("Factorial of " + num + " is: " + factorial(num));

    int zeroes = (int) num / 5;
    System.out.println("TrailingZero is " + zeroes);
  }
}
