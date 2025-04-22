public class Demo {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("hello");
        StringBuilder b = a;
        StringBuilder c = b;

        c.replace(0, a.length(), "world");

        System.out.println(a.toString()); // world
        System.out.println(b.toString()); // world
        System.out.println(c.toString()); // world
    }
}
