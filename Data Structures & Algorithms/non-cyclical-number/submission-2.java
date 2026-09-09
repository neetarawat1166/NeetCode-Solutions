class Solution 
{
    public boolean isHappy(int n) 
    {
        Set<Integer> s = new HashSet<Integer>();

        while(n!=1)
        {
            if(s.contains(n))
                return false;

            s.add(n);
            n = squares(n);   
        }
        return true;    
    }
    public int squares(int n)
    {
        int sum = 0;
        while (n > 0) 
        {
            int digit = n % 10;
            int square = digit * digit;
            sum = sum + square;
            n = n / 10;
        }
        n = sum;
        return n;

    }

}
