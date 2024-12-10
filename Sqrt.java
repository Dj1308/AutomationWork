class Solution {
    public int mySqrt(int x) {
        int output=0,i;
        for(i=2;i<x/2;i++)
        {
                output=i*i;
                System.out.println("output="+output);
        }
        while(output>x)
        {
            i=i-1;
            output=i*i;
        }
        return i;
    }
}
