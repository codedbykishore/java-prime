public class Prefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "race", "racecar", "raceingcar" }));
        System.out.println(longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
    }

    public static String longestCommonPrefix(String[] strs) {

        int minn = Integer.MAX_VALUE;
        for (String s : strs) {
            minn = Math.min(minn, s.length());
        }

        int i = 0;
        while (i < minn) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (s.charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
            i++;
        }

        return strs[0].substring(0, i);
    }
}
