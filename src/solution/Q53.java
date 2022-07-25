package solution;

import java.util.Arrays;

public class Q53 {
	public int maxSubArray(int[] nums) {
		int max = Arrays.stream(nums).max().getAsInt();
		int curSum = Integer.MIN_VALUE;
		boolean isInMax = false;
		for (int i = 0; i < nums.length; i++) {
			int curNum = nums[i];

			if (isInMax) {
				curSum += curNum;
				if (curSum < 0)
					isInMax = false;
			} else {
				if (curNum > 0) {
					// start trail
					isInMax = true;
					curSum = curNum;
				}
			}

			max = Math.max(max, curSum);
		}
		return max;
	}
}
