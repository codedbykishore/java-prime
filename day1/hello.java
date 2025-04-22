public class hello {
  public static void main(String[] args) {
    int num = 12321;
    int firsthalf = 12;

    int len = Integer.toString(num).length();
    int len2 = Integer.toString(firsthalf).length();

    // System.out.println(num);
    // System.out.println(len2);
    // System.out.println();

    int lasthalf = (int) (num % (Math.pow(10, len2+1)));
    int lenoflasthalf = (int) (Math.log10(num));
    
    System.out.println(lasthalf);
    System.out.println(lenoflasthalf);
    System.out.println(lasthalf % Math.pow(10, lenoflasthalf));
    
  }
}
