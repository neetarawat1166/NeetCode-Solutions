class Solution {
    public int search(int[] nums, int target) {
        
        int a = nums.length;
        int b = a/2;

        if(target>=nums[b])
        {
            for(int i=b;i<a;i++)
            {
               if(target==nums[i])
                    return i;
                    
            }
        }
        else
        {
            for(int i=0;i<b;i++)
            {
               if(target==nums[i])
                    return i;     
            }
        }
    return -1;
    }
}
