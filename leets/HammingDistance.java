
public class HammingDistance {

    public static void main(String[] args) {

        int a = 123;
        int b = 123;
        int c = a ^ b;

        System.out.println("XOR result: " + c);
        System.out.println("Hamming Distance: " + countOnes(c));
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
