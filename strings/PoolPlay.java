public class PoolPlay {
    public static void main(String[] args) {
        String a = "user";
        String b = "user";
        String c = new String("user");

        System.out.println(a == b);
        System.out.println(a == "user");

        System.out.println(a == c);
        System.out.println(b == new String("user"));

        System.out.println(a.equals("user"));

        // Print the address of each of the strings
        // System.out.println("a: " + a + " @ " + System.identityHashCode(a));
        // System.out.println("b: " + b + " @ " + System.identityHashCode(b));
        // System.out.println("c: " + c + " @ " + System.identityHashCode(c));
        //
        // System.out.println();
        // System.out.println("a == b: " + (a == b)); // true (same pool reference)
        // System.out.println("a == c: " + (a == c)); // false (new object)
        // System.out.println("a.equals(c): " + a.equals(c)); // true (same content)
        //
        // String d = c.intern(); // Push c's value to pool (if not already)
        // System.out.println("a == d: " + (a == d)); // true (now same ref)
    }
}
