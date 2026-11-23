class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for(int i : stones) {
            pq.offer(i);
        }

        while (pq.size() > 1) {
            int diff = pq.poll() - pq.poll();
            if (diff > 0) pq.add(diff);
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
