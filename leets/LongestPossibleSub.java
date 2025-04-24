import java.util.HashSet;

public class LongestPossibleSub {
    public static void main(String[] args) {
        maxSub("pwwkew");
        maxSub("abba");
        maxSub("somethings");
    }

    public static int maxSub(String input) {

        int max = 0;
        int l = 0;

        HashSet<Character> set = new HashSet<>();
        HashSet<String> longestSubstrings = new HashSet<>();

        for (int r = 0; r < input.length(); r++) {
            while (set.contains(input.charAt(r))) {
                set.remove(input.charAt(l));
                l++;
            }

            int length = r - l + 1;
            if (max < length) {
                max = Math.max(max, length);
                longestSubstrings.clear();
                longestSubstrings.add(input.substring(l, r + 1));
            } else if (max == length) {
                longestSubstrings.add(input.substring(l, r + 1));
            }

            set.add(input.charAt(r));
        }

        for (String str : longestSubstrings) {
            System.out.println(str);
        }

        System.out.println("Max: " + max);
        System.out.println();

        return max;
    }
}
