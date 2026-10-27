class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for(int i : nums) {
            if(counts.containsKey(i)) {
                return true;
            }

            counts.put(i, 0);
        }

        return false;
    }
}