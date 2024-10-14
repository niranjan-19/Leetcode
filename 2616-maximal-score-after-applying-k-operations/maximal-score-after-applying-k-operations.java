class Solution {
    public long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for (int x : nums)
            pq.add(x);
        while (k-- > 0) {
            int val = pq.poll();
            ans += val;
            pq.add((val + 2) / 3);
        }
        return ans;
    }
}