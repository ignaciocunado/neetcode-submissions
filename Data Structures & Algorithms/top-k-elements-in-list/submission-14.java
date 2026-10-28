class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];

        for(int n : nums) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
        }

        for(int i = 0; i < nums.length + 1; i++) {
            buckets[i] = new ArrayList<>();
        }

        for(int n : counts.keySet()) {
            int freq = counts.get(n);
            buckets[freq].add(n);
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i > 0 && index < k; i--) {
            for (int n : buckets[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
