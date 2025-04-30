
public class Loop {

    public static void main(String[] args) {

        int num = 10;
        loop(num);

        return;
    }

    public static void loop(int n) {

        if (n < 1) {
            return;
        }

        loop(n - 1);
        System.out.println(n);
    }
}
