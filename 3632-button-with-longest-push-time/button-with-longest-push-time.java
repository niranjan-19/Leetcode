class Solution {
    public int buttonWithLongestTime(int[][] events) {
        var index = events[0][0];
        var maxTime = events[0][1];

        for (var i = 1; i < events.length; i++) {
            var diff = events[i][1] - events[i - 1][1];

            if (diff == maxTime)
                index = Math.min(events[i][0], index);
            else if (diff > maxTime) {
                index = events[i][0];
                maxTime = events[i][1] - events[i - 1][1];
            }
        }
        return index;
    }
}
