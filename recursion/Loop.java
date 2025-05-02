
public class Loop {

    public static void main(String[] args) {

        int num = 10;
        loop(num);
    }

    public static void loop(int n) {

        if (n < 1) {
            return;
        }

        System.out.println("Function call for " + n);
        loop(n - 1);
        System.out.println("Function done for " + n);
    }
}
