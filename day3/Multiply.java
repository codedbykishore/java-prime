import java.util.*;

public class Multiply {
	public static void main(String[] args) {
		int num = 7;
		int times = 9;
		
		int res = 0;

		for (int i = 0; i < times; i++) {
			res += num;
		}

		System.err.println(res);
	}
}


