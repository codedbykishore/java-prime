import java.util.*;

public class ExceptHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Give a input: ");
            int n = 12312;
            int m = sc.nextInt();

            System.out.println(n / m);

            sc.close();
        } catch (Error e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Program completed");
        }
    }
}
