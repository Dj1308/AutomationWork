import java.util.StringTokenizer;
class Solution {
    public int lengthOfLastWord(String s) {
        StringTokenizer tok = new StringTokenizer(s," ");
        int len=0;
        while(tok.hasMoreTokens())
        {
            String st = tok.nextToken();
            if(len<st.length())
            {
                len=st.length();
            }
        }
        return len;
        
    }
}
