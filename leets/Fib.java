
public class Fib {

    public static void main(String[] args) {

        int prev = 0;
        int curr = 1;

        for (int i = 0; i < 20; i++) {
            int temp = curr;
            curr += prev;
            prev = temp;
            System.out.println(curr);
        }

        return;
    }
}
