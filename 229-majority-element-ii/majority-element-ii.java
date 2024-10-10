class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int min = (int) (n / 3) + 1;

        for (int i = 0; i < n; i++) {
            int val = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], val + 1);

            if (mpp.get(nums[i]) == min) {
                list.add(nums[i]);

            }
            if (list.size() == 2)
                break;

        }
return list ;
    }
}