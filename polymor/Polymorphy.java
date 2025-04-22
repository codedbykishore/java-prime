public class Polymorphy {

    public static void main(String[] args) {
        int x = 10;
        int y = 23;
        int z = 12;
        String s = "Hello";

        System.out.println("1: " + add(x));
        System.out.println("2: " + add(x, y));
        System.out.println("3: " + add(x, y, z));
        System.out.println("4: " + add(x, s));
    }

    public static int add(int a) {
        return a + a;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static String add(int a, String b) {
        return a + b;
    }
}
