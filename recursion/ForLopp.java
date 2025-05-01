
public class ForLopp {

    public static void main(String[] args) {
        loop(10);
    }

    public static int loop(int n) {
        if (n <= 0) {
            return n;
        }
        loop(n - 1);
        System.out.println(n);
    }
}
