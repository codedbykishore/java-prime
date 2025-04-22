import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 5, 5, 5, 6, 6, 6 };

		HashSet<Integer> nums = new HashSet<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();

		for (int n : arr) {
			if (nums.contains(n)) {
				res.add(n);
			} else {
				nums.add(n);
			}
		}

		if (res.isEmpty()) {
			System.out.println("Theres no Duplicates");
		} else {
			System.out.println(res);
		}
	}
}
