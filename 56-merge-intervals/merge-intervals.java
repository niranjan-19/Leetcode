class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length; // size of the array
        // sort the given intervals:
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> ansList = new ArrayList<>();

        for (int i = 0; i < n; i++) { // select an interval:
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Skip all the merged intervals:
            if (!ansList.isEmpty() && end <= ansList.get(ansList.size() - 1)[1]) {
                continue;
            }

            // check the rest of the intervals:
            for (int j = i + 1; j < n; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            ansList.add(new int[] { start, end });
        }

        // Convert List<int[]> to int[][]
        int[][] ansArray = new int[ansList.size()][2];
        for (int i = 0; i < ansList.size(); i++) {
            ansArray[i] = ansList.get(i);
        }

        return ansArray;

    }
}