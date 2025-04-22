public class Palindrome {
  public static void main(String[] args) {

    int num = 12345;
    int len2 = (int) Math.log10(num);
    System.out.println(len2);
    int len = Integer.toString(num).length();
    int temp = num;

    while (temp != 0) {
      int i = temp % (len - 1);
      int j = temp % 10;

      System.out.println(i + " " + j);

      temp = temp / (len - 1);
      temp = temp / 10;
    }
  }
}
