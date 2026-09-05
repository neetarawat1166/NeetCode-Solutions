class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int a = 0;
        int res = 0;

        for(int i=0; i<s.length();i++)
        {
            while(set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(a));
                a++;
            }
            set.add(s.charAt(i));
            res = Math.max(res, i-a+1);
        }

        return res;
    }
}
