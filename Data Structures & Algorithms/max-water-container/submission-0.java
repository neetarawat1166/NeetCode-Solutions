class Solution {
    public int maxArea(int[] heights) 
    {
        int width = heights.length-1;
        int left = 0;
        int right = width;
        int maxarea = 0;

        while(left<right)
        {
            int height = Math.min(heights[left],heights[right]);
            int area = height * width;
            if(area>maxarea)
            {
                maxarea = area;
            }
            if(heights[left]<heights[right])
            {
                left++;
                width = width-1;
            }
            else
            {
                right--;
                width = width-1;
            }
        }

        return maxarea;
    }
}
