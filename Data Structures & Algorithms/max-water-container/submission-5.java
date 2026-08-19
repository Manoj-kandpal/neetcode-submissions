class Solution {
    public int maxArea(int[] heights) {
        int total = 0;

        int low = 0;
        int high = heights.length - 1;

        while (low < high) {
            int left = heights[low];
            int right = heights[high];

            total = Math.max(total, (high - low) * Math.min(left, right));

            if (heights[low] < heights[high]) low++;
            else high--;
        }

        return total;
    }
}
