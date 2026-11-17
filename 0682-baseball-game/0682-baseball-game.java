class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<operations.length; i++) {

            if(operations[i].equals("+")) {

                int a = stack.peek();
                int b = stack.get(stack.size() - 2);

                stack.push(a + b);
            }
            else if(operations[i].equals("D")) {
                int a = stack.peek();

                stack.push(a * 2);
            }
            else if(operations[i].equals("C")) {
                stack.pop();
            } 
            else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}