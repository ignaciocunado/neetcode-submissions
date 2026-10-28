class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(isOpen(c)) {
                stack.push(c);
                continue;
            }

            if(stack.isEmpty()) {
                return false;
            }

            if(matches(stack.peek(), c)) {
                stack.pop();
            }
            else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpen(char s) {
        return s == '(' || s == '[' || s == '{';
    }

    private boolean matches(char o, char c) {
        switch(o) {
            case '{':
                return c == '}';
            case '(':
                return c == ')';
            case '[':
                return c == ']';
            default:
                return false;
        }
    }
}
