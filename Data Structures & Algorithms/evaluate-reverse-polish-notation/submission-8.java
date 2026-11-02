class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(String s : tokens) {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(arithmetic(s, a, b));
            }
            else {
                stack.push(Integer.valueOf(s));
            }
        }

        return stack.pop();
    }

    private int arithmetic(String operator, int a, int b) {
        if(operator.equals("+")) {
            return a + b;
        }
        else if(operator.equals("-")) {
            return a - b;
        }
        else if(operator.equals("*")) {
            return a * b;
        }
        return a / b;
    }
}
