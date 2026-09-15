class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int length = piles.length;
        int max = 0;
        int left = 1;

        for(int i=0;i<length;i++)
        {
            if(piles[i]>max)
            {
                max = piles[i];
            }
        }
        int k = max;
        int right = max;
        int answer = max;

        if(h==length)
        {
            return max;
        }

        while(left<=right)
        {
            k = left + (right-left)/2;
            long totalHours = 0;

            for(int i=0;i<length;i++)
            {
                totalHours += (piles[i] + k-1)/k;
            }
            
            if(totalHours <= h) 
            {
                answer = k;
                right = k - 1;
            } 
            else 
            {
                left = k + 1;
            }

        }

        return answer;
        
    }
}
