class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int n = events.length;
        int maxi = Integer.MIN_VALUE;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int temp = (i == 0) ? events[i][1] : (events[i][1] - events[i - 1][1]);
            if (temp > maxi || (temp == maxi && events[i][0] < ans)) {
                maxi = temp;
                ans = events[i][0];
            }
        }

        return ans;
    }
}
