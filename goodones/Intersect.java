
import java.util.ArrayList;
import java.util.HashSet;

// Common elements in 2 arrays
public class Intersect {

    public static void main(String[] args) {

        int[] arr1 = { 1, 5, 9, 33, 56 };
        int[] arr2 = { 9, 5, 16, 33, 12 };

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                res.add(num);
                set.remove(num);
            }
        }

        System.out.println(res);
    }
}
