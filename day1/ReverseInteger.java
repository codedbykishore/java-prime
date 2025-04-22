import java.util.*;

public class ReverseInteger {
  public static void main(String[] args) {
    
    int input = 12321;
    int lastHalf = 0;
    
    int firstHalf = input;
    while (lastHalf < firstHalf) {
      lastHalf *= 10;
      lastHalf += firstHalf % 10;
      firstHalf = firstHalf / 10;
    }

    System.out.println(firstHalf);
    System.out.println(lastHalf);

    if (firstHalf == lastHalf/10 || firstHalf == lastHalf) {
      System.out.println(input + " is a palindrome");
    } else {
      System.out.println(input + " is not a palindrome");
    }
    
    return;
  }
}

