package day4;

import java.util.HashSet;

public class Duplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 5, 6 };

		HashSet<Integer> s = new HashSet<Integer>();
		boolean flag = false;

		for (int n : arr) {
			if (s.contains(n)) {
				flag = true;
			}
			s.add(n);
		}

		if (flag) {
			System.out.println("Duplicate exist");
		} else {
			System.out.println("Not no duplicates");
		}
	}
}
