
public class CreateBraces {

    public static void main(String[] args) {
        int n = 3;
        generate("", n, n);
    }

    private static void generate(String current, int open, int close) {
        if (open == 0 && close == 0) {
            System.out.println(current);
            return;
        }

        if (open > 0) {
            generate(current + "(", open - 1, close);
        }

        if (close > open) {
            generate(current + ")", open, close - 1);
        }
    }
}
