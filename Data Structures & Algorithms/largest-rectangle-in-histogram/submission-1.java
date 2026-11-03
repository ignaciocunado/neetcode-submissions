class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> ih = new Stack<>();
        
        int res = 0;
        for(int i = 0; i < heights.length; i++) {
            res = Math.max(res, heights[i]);

            if(ih.isEmpty()) {
                ih.push(new int[]{i, heights[i]});
                continue;
            }

            if(heights[i] < ih.peek()[1]) {
                int latest = -1;
                while(! ih.isEmpty() && heights[i] < ih.peek()[1]) {
                    int[] old = ih.pop();
                    res = Math.max(res, (i - old[0]) * old[1]);
                    latest = old[0];
                }

                ih.push(new int[]{latest, heights[i]});
            }
            else {
                ih.push(new int[]{i, heights[i]});
            }
        }

        while(!ih.isEmpty()) {
            int[] el = ih.pop();
            res = Math.max(res, (heights.length - el[0]) * el[1]);
        }

        return res;
    }
}
