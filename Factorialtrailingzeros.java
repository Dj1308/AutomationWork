class Solution {
    public int trailingZeroes(int n) {
        int fact=n,j=0;
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 0;
        }
        else
        {
            while(n!=1)
            {
                n=n-1;
                fact = fact * n;
                
            }
            System.out.println("Factorial="+fact);
            while(fact%10==0)
            {
                fact=fact/10;
                j++;
            }
        }
        return j;
    }
}
