class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        
        int res = 0;
        for(int p : prices) {
            minSoFar = Math.min(minSoFar, p);
            res = Math.max(res, p - minSoFar);
        }

        return res;
    }
}
