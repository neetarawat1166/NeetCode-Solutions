class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        List<Integer>[] buckets = new ArrayList[nums.length+1];
        int[] res = new int[k];
        int c = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i]))
                m.put(nums[i],m.get(nums[i])+1);
            else
                m.put(nums[i],1);
        }

        for (int key : m.keySet()) 
        { 
            int n = m.get(key); 
            if (buckets[n] == null) 
            { 
                buckets[n] = new ArrayList<>(); 
            } 
            
            buckets[n].add(key); 
        }

        for (int i = buckets.length - 1; i >= 1; i--)
        {
            if(buckets[i]!=null)
            {
                for(int n : buckets[i])
                {
                    res[c] = n;
                    c++;
                    if (c == k) 
                        return res;
                }
            }
        }

        return res;

    }
}

