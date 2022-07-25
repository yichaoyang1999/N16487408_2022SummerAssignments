package solution;

public class Q122 {
	public int maxProfit(int[] prices) {
		int pricesCount = prices.length;
		int result = 0;
		for (int i = 0; i < pricesCount - 1; i++) {
			int diff = Math.max(prices[i + 1] - prices[i], 0);
			result += diff;
		}

		return result;
	}
}
