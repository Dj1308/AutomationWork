class Solution {
    public String longestCommonPrefix(String[] strs) {
        char[] a = strs[0].toCharArray();
        int comp=a.length;
        String oldsubstr="";
        for(int i=1;i<strs.length;i++)
        {
            char[] b = strs[i].toCharArray();
            int arrlen;
            if(b.length<comp)
            {
                comp=b.length;
            }
            String substr="";
            for(int j=0,k=0;j<comp;j++)
            {
                if(b[j]==a[j] && j==k)
                {
                    substr = substr + Character.toString(b[j]);
                    System.out.println("Substring="+substr);
                    k++;
                }
                else if(b[j]==a[j] && j!=k)
                {
                    //update substring
                    if(oldsubstr.length()<substr.length())
                    {
                        oldsubstr = substr;
                    }
                    k=j;
                    substr = Character.toString(b[j]);
                }
                else if(j==comp-1)
                {
                    if(substr.length()>oldsubstr.length())
                    {
                        oldsubstr = substr;
                    }
                }
            }
        }
        return oldsubstr;
        
    }
}
