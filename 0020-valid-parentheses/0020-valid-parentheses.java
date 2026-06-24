class Solution {
    public boolean isValid(String s) {
        Stack<Character> box = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                box.push(s.charAt(i));
            }
            else {
                if(box.size() == 0) {
                    return false;
                }
                if( (box.peek() == '(' && s.charAt(i) == ')') ||
                    (box.peek() == '{' && s.charAt(i) == '}') ||
                    (box.peek() == '[' && s.charAt(i) == ']')) {
                    box.pop();
                }
                else {
                    return false;
                }
            }
        }
        return box.size() == 0;
    }
}