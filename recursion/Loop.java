
public class Loop {

    public static void main(String[] args) {

        // loop(1, Integer.MAX_VALUE);
        loop(1, 10);

        return;
    }

    public static void loop(int start, int end) {

        System.out.println(start);

        if (start == end) {
            return;
        }

        loop(start + 1, end);

    }
}
