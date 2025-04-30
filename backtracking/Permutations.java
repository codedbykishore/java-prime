import java.util.ArrayList;

public class Permutations {

    public static void main(String[] args) {
        String input = "abc";
    }

    public static void permutation(String str, String permute, ArrayList<String> result) {
        if (str.length() == 0) {
            result.add(permute);
        }

    }
}
