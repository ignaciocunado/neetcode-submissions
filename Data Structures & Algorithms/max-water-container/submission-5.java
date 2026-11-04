class Solution {
    public int maxArea(int[] heights) {
        int maxCapacity = 0;
        int l = 0, r = heights.length - 1;

        while(l < r) {
            int currentCapacity = Math.min(heights[l], heights[r]) * (r - l);
            maxCapacity = Math.max(maxCapacity, currentCapacity);

            if(heights[l] < heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }

        return maxCapacity;
    }
}
