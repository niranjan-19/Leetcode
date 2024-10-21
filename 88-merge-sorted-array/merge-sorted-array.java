class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if(n==0) return ;
       int len = nums1.length;
       int index = len -1 ;
       while(n >0 && m >0 ){
        if(nums1[m-1]<=nums2[n-1]){
            nums1[index] = nums2[n-1];
            n--;
        }
        else{
            nums1[index] = nums1[m-1];
            m--;

        }
index--;
       }
       while(n>0){
        nums1[index] = nums2[n-1];
        n--;
        index--;
       }
    }
}
