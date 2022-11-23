class Solution {
    public int countNegatives(int[][] grid) {
            int res = 0;
            for (int row = 0 ; row < grid.length ; row++) {
                int left = 0;
                int right = grid[row].length-1;
                int mid = 0;
                int ind = -1;
                while (left <= right) {
                    mid = left + (right - left)/2;
                    if (grid[row][mid] < 0) {
                        ind = mid;
                        right = mid -1;
                    } else {
                        left = mid + 1;
                    }
                }
                if (ind == -1) {
                    res += 0;
                } else
                    res += grid[row].length-ind;
            }
            return res;
        }
}