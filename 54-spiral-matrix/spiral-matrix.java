class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;
        List<Integer> list = new ArrayList<Integer>();

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);

            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);

            }
            right--;
            //condition for edge case -- if matrix has one roe only 
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);

                }
                bottom--;
            }
            //if matrix has no top and left has still elements -- 
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);

                }
                left++;
            }
        }
        return list;
    }
}
