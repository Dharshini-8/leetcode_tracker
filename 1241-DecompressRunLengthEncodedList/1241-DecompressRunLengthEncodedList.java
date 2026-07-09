// Last updated: 7/9/2026, 9:26:31 AM
class Solution {
	public static int[] decompressRLElist(int[] nums) {

		int n = nums.length;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i+=2) {

			int freq = nums[i];
			int val = nums[i+1];

            for (int j = 0; j < freq; j++) {
				list.add(val);
			}

		}

		int result[] = new int[list.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = list.get(i);
		}

		return result;
	}
}