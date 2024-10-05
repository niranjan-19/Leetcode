class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int swapInd = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                swapInd = i;
                break;
            }
        }
        if (swapInd == -1) {
            Arrays.sort(nums);
            return;
        }
        int swapWithInd = swapInd + 1;
        int swapWithVal = nums[swapWithInd];
        for (int i = swapInd + 2; i < n; i++) {
            if (nums[i] > nums[swapInd] && nums[i] < swapWithVal) {
                swapWithInd = i;
                swapWithVal = nums[i];
            }
        }
        int temp = nums[swapInd];
        nums[swapInd] = swapWithVal;
        nums[swapWithInd] = temp;
        Arrays.sort(nums, swapInd + 1, n);
        return;
    }
}
