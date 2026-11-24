class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lowerBound = 1;
        int upperBound = -1;
        for(int i : piles) {
            upperBound = Math.max(upperBound, i);
        }

        int res = upperBound;
        while(lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            
            int count = 0;
            for(int pile : piles) {
                count += (pile + mid - 1) / mid;
                if (count > h) break;
            }

            if(count <= h) {
                res = Math.min(res, mid);
                upperBound = mid - 1;
            }
            else {
                lowerBound = mid + 1;
            }
        }

        return res;
    }
}
