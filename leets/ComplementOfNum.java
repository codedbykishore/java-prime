
public class ComplementOfNum {
    public static int flipBitsAuto(int n) {
        int bits = Integer.toBinaryString(n).length();
        int mask = (1 << bits) - 1;
        return n ^ mask;
    }

    public static void main(String[] args) {
        int num = 10;
        int result = flipBitsAuto(num);
        System.out.println(result); // Output: 2
    }
}
