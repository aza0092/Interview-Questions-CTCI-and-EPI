// https://leetcode.com/articles/missing-number/
// on, o1 space

class Solution {
	public int missingNumber(int[] nums) {
		int missing = nums.length;
		for (int index = 0; index < nums.length; index++) {
			missing ^= index ^ nums[index];
		}
		return missing;
	}
}