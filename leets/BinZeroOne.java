
public class BinZeroOne {

    public static void main(String[] args) {
        int num = 20;
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Zeros in num: " + countZeros(num));
        System.out.println("Ones in num: " + countOnes(num));
    }

    public static int countZeros(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

}
