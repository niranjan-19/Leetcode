class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
int sum = n*(n+1)/2;

int nsum = 0;
for(int i =0 ; i <=n-1 ; i++){

nsum+=nums[i];



}
return (sum -nsum);
}
}