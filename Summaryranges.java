class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> sr = new ArrayList<>();
            for(int i=0;i<nums.length-1;)
            {
                int[] temp = new int[nums.length];
                int j=0;
                int flag=0;
                while((nums[i+1]-nums[i])==1)
                {
                    flag=1;
                    temp[j]=nums[i];
                    j=j+1;
                    temp[j]=nums[i+1];
                    j=j+1;
                    i++;
                }
                if(flag==1)
                {
                    sr.add(Arrays.toString(temp));
                }
                else
                {
                    sr.add(Arrays.toString(new int[]{nums[i]}));
                    i++;
                }
                
            }
            return sr;
        }
}
