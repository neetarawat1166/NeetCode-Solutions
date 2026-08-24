class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums[i]+nums[j]==target
        //nums[j]==target-nums[i]

        Map<Integer, Integer> m = new HashMap<>();
        int a[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int n = target-nums[i];
            if(m.containsKey(n))
            {
                int j = m.get(n);
                if(i<j)
                {
                    a[0]=i;
                    a[1]=j;
                }
                else
                {
                    a[0]=j;
                    a[1]=i;
                }
                return a;
            }
            else
            {
                m.put(nums[i],i);
            }
        }

        return a;
    }

}