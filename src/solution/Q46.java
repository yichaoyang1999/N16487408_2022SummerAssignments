package solution;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.PersistentMBean;

public class Q46 {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> resultList = new ArrayList();
		permutation(resultList, nums, 0);
		return resultList;
	}

	public void permutation(List<List<Integer>> resList, int[] nums, int index) {
		int numsCount = nums.length;
		// exit condition
		if (index == numsCount) {
			List<Integer> resIntegers = new ArrayList<Integer>();
			for (int i = 0; i < numsCount; i++) {
				resIntegers.add(nums[i]);
			}
			resList.add(resIntegers);
		}
		// normal condition
		for (int i = index; i < numsCount; i++) {
			swap(nums, i, index);
			permutation(resList, nums, index + 1);
			swap(nums, index, i);
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
