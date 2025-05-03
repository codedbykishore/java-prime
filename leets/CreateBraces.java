
public class CreateBraces {

    public static void main(String[] args) {
        int num = 3;
        findBraces(num);
    }

    public static void createBraces(String current, int open, int close) {
        if (open == 0 && close == 0) {
            System.out.println(current);
            return;
        }

        if (open > 0) {
            createBraces(current + "{", open - 1, close);
        }

        if (open < close) {
            createBraces(current + "}", open, close - 1);
        }
    }

    public static void findBraces(int num) {
        createBraces("", num, num);
    }
}
