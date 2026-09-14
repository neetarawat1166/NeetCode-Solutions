class Solution {
    public double myPow(double x, int n) 
    {
        long a = n;
        double result = 1;

        if(a<0)
        {
            x = 1/x;
            a = -a;
        }

        while(a>0)
        {
            if(a%2==1)
            {
                result = result * x;
            }
            
            x = x*x;
            a = a/2;
        }

        return result;
    }
}
