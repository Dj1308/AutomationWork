class Solution {
    public boolean isPalindrome(String s) {
        int flag=0;
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        System.out.println("String is =" + s );
        for(int i=0,j=s.length()-1;i<=j;i++,j--)
        {
            System.out.println("i =" + s.charAt(i) + " j =" + s.charAt(j) );
            if(s.charAt(i)==s.charAt(j))
            {
                continue;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
