class Solution {
    public void rotate(int[] nums, int k) {
        int temp,j=0;
    while(j<k)
    {
        temp=nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--)
        {
            nums[i]=nums[i-1];
        }
        nums[0]=temp;
        j++;
    }
        
    }
}