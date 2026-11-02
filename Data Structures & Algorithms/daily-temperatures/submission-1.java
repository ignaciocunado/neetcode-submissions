class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> s = new Stack<>();

        for(int i = 0; i < temperatures.length; i++) {
            if(s.isEmpty() || temperatures[i] <= s.peek()[0]) {
                s.push(new int[]{temperatures[i], i});
                continue;
            }

            while(! s.isEmpty() && temperatures[i] > s.peek()[0]) {
                int[] top = s.pop();
                res[top[1]] = i - top[1];
            }
            s.push(new int[]{temperatures[i], i});
        }

        return res;
    }
}
