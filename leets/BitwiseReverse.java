
public class BitwiseReverse {
    public static void main(String[] args) {
        int input = 5;

        int compliment = ~input;

        int mask = 0;

        while (mask < input) {
            mask = (mask << 1) | 1;
        }

        compliment &= mask;
        System.out.println(compliment);
    }
}
