class Solution {
    public int singleNumber(int[] nums) {
if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int n = nums.length;
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int range = max - min + 1;
        int[] hash = new int[range];

        for (int i = 0; i < n; i++) {
            hash[nums[i] - min]++;
        }

        for (int i = 0; i < n; i++) {
            if (hash[nums[i] - min] == 1) {
                return nums[i];
            }
        }
        return -1 ;
    }
}