class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        
        Map<Character,Integer>a=new HashMap<>();
        Map<Character,Integer>b=new HashMap<>();

        for (int i = 0; i < s.length(); i++) 
        {
           char c =  s.charAt(i);
           char d = t.charAt(i);

           if(a.containsKey(c))
                a.put(c,a.get(c)+1);
           else
                a.put(c,1);

           if(b.containsKey(d))
                b.put(d,b.get(d)+1);
           else
                b.put(d,1);
        }

        return a.equals(b);

    }
}
