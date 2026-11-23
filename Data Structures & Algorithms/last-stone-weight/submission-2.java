class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for(int i : stones) {
            pq.offer(i);
        }

        while(pq.size() > 1) {
            int stone1 = pq.poll();
            int stone2 = pq.poll();

            if(stone1 == stone2) {
                if(pq.isEmpty()) {
                    return 0;
                }
            }

            pq.add(Math.abs(stone1 - stone2));
        }

        return pq.poll();
    }
}
