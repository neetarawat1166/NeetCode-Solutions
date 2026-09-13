class Solution {
    public int findDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<Integer>();
        int duplicate = 0;

        for(int i =0;i<nums.length;i++)
        {
            if(set.contains(nums[i]))
            {
                duplicate = nums[i];
                return duplicate;
            }
            else
            {
                set.add(nums[i]);
            }
        }

        return duplicate;
    }
}
