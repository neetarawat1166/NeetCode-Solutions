class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        List<String> s = new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            int[] arr = new int[26];
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<strs[i].length();j++)
            {
                int b = strs[i].charAt(j);
                int count = b-'a';

                arr[count]++;
            }
            for (int n : arr) 
            {
                list.add(n);
            }

            String key = list.toString();

            //Need to check below
            if (m.containsKey(key)) {
                m.get(key).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                m.put(key, temp);
            }  
        }

        return new ArrayList<>(m.values());

    }
}