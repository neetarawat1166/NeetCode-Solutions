class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+") && !s.isEmpty())
            {
                int temp1 = s.pop();
                int temp2 = s.pop();
                int result = temp1+temp2;
                s.push(result);
            }
            else if (tokens[i].equals("-") && !s.isEmpty())
            {
                int temp1 = s.pop();
                int temp2 = s.pop();
                int result = temp2-temp1;
                s.push(result);
            }
            else if(tokens[i].equals("*") && !s.isEmpty())
            {
                int temp1 = s.pop();
                int temp2 = s.pop();
                int result = temp1*temp2;
                s.push(result);
            }
            else if(tokens[i].equals("/") && !s.isEmpty())
            {
                int temp1 = s.pop();
                int temp2 = s.pop();
                int result = temp2/temp1;
                s.push(result);
            }
            else
            {
                s.push(Integer.parseInt(tokens[i]));
            }

        }

        return s.peek();

    }
}
