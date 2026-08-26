class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                a.push(s.charAt(i));
        
            if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}')
                {
                    if(!a.isEmpty())
                    {
                        Character b = a.peek();
                        if(s.charAt(i)==')' && b!='(')
                            return false;
                        if(s.charAt(i)==']' && b!='[')
                            return false;
                        if(s.charAt(i)=='}' && b!='{')
                            return false;

                        a.pop();
                    }
                    else
                        return false;
                }    
        }
        if(!a.isEmpty())
            return false;
        else
            return true;

    }
}
