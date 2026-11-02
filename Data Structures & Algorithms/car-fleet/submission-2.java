class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] ps = new int[speed.length][2];
        for(int i = 0; i < position.length; i++) {
            ps[i] = new int[]{position[i], speed[i]};
        }

        Arrays.sort(ps, (x, y) -> - Integer.compare(x[0], y[0]));

        Stack<Double> s = new Stack<>();
        for(int i = 0; i < speed.length; i++) {
            double remainingTime = (double) (target - ps[i][0]) / ps[i][1];
            s.push(remainingTime);

            if (s.size() >= 2 && s.peek() <= s.get(s.size() - 2)) {
                s.pop();
            }
        }

        return s.size();
    }
}
