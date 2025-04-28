
public class ExtraDigit {

    public static void main(String[] args) {
        // Find the extra digit
        int num1 = 1234;
        int num2 = 12354;

        // find which is different
        int diff = num1 ^ num2;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(diff);
    }
}
