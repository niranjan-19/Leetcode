class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i = 1; i < size; i++){
            for(int j = i; j < size; j++){
                int a = j - i;
                if( nums[a] + nums[j] == target){
                    System.gc();
                    return new int[] {a,j};
                }
            }   
        }
        return new int[0];
    }
}

