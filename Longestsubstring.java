class Solution {
    public int lengthOfLongestSubstring(String s) {
        char a[] = s.toCharArray();
        String substr = "";
        int len=0;
        for(int i=0,j=0;i<a.length;i++)
        {
            char c = a[i];
            if(!substr.contains(String.valueOf(c)))
            {
                substr = substr+c;
                j++;
            }
            else if(substr.contains(String.valueOf(c)))
            {
                if(len < substr.length())
                {
                    len = substr.length();
                }                
                substr = "";
            }
        }
        if(len < substr.length())
                {
                    len = substr.length();
                }   
        System.out.println("Final String is = "+ substr);
        return len;
    }
}
