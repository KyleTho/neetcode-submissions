class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> closeToOpen = new HashMap<>();

        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');
        
        for (char bracket : s.toCharArray()) {

            if (closeToOpen.containsKey(bracket)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(bracket)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(bracket);
            }
        }
        return stack.isEmpty();
    }
}
