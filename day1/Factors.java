import java.util.*;

public class Factors {
  
  public static boolean isPrime(int num, int divisor) {
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Input = 100;

    for (int i = 1; i <= Input; i++) {
      int num = i;
      if (isPrime(num)) {
        System.out.println(num);
      }
    }
  }
  
}

