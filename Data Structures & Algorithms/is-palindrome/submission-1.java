class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        //fun. call Character.isLetterOrDigit -> used for the comparsison to check non alphanumeric values...

        while(i<j)
        {
            // char a = s.charAt(i);
            // char b = s.charAt(j); -> This was only storing the static value and while loops we incrementing the i

            while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
            }

            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                return false;
            
            i++;
            j--;
        }

        return true;
    }
}
