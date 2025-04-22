public class Divide {
	public static void main(String[] args) {
		return;
	}

	public int divide(int dividend, int divisor) {
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;

		int sign = ((dividend > 0) == (divisor > 0)) ? 1 : -1;

		long num = Math.abs((long) dividend);
		long div = Math.abs((long) divisor);

		int ans = 0;
		while (num >= div) {
			int mult = 0;
			while (num >= (div << mult)) {
				mult++;
			}
			mult--;
			num -= (div << mult);
			ans += (1 << num);
		}

		return ans * sign;
	}
}
