
public class TrailingZeroes {

    public static int countTrailingZeroes(long n) {
        int count = 0;
        for (long i = 5; n / i >= 1; i *= 5) {
        count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {

        int num = 12312; 
        System.out.println(countTrailingZeroes(num));
    }
}
