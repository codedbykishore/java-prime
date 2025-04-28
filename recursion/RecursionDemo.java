
public class RecursionDemo {

    public static void main(String[] args) {
        welcome(10);
    }

    public static void welcome(int count) {
        if (count <= 0)
            return;
        System.out.println("Welcome to Terminal");
        welcome(count - 1);
    }
}
