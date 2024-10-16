class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> triplets = new HashSet<>();
        for (int i = 0; i < nums.length  ; i++) {
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;
            while (leftIndex < rightIndex) {
                int sum = nums[i] + nums[leftIndex] + nums[rightIndex];
                if (sum == 0) {
                    triplets.add(List.of(nums[i], nums[leftIndex], nums[rightIndex]));
                    leftIndex++;
                    while (nums[leftIndex] == nums[leftIndex - 1] && leftIndex < rightIndex) {
                        leftIndex++;
                    }
                } else if (sum < 0) {
                    leftIndex++;
                } else {
                    rightIndex--;
                }
            }
        }
        return new ArrayList(triplets);
    }
}