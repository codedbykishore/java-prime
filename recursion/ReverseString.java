
public class ReverseString {

    public static void main(String[] args) {
        String word = "malayalam";
        String reversed = reverse(word);
        System.out.println(reversed);
    }

    public static String reverse(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
