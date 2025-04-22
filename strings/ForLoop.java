public class ForLoop {

    public static void main(String[] args) {
        // call those string printing fucnions
        StringBuilder s = new StringBuilder("hello");
        // String s1 = "hello";

        printBuilder(s);
        // printString(s1);
    }

    // Append hundred times to iteself in both string and string Builder

    public static void printString(String s) {
        for (int i = 0; i < 100; i++) {
            s = s + s;
        }
    }

    // Append hundred times to iteself in both string and string Builder
    public static void printBuilder(StringBuilder s) {
        for (int i = 0; i < 100; i++) {
            s.append(s);
        }
    }
}
