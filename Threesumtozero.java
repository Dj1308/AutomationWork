class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int i=0,j=i+1,k=j+1;
        List<List<Integer>> Listoflist = new ArrayList<>();
      //  [-4,-1,-1,0,1,2]
      Arrays.sort(nums);
        while(i<nums.length-2)
        {
            while(k<=nums.length-1)
            {
                 if((nums[i]+nums[j]+nums[k])==0)
                {  
                    List<Integer> lists = new ArrayList<>();
                    lists.add(nums[i]);
                    lists.add(nums[j]);
                    lists.add(nums[k]);
                    Listoflist.add(lists);
                    
                }
                k++;
            }
           i++;
           j++;
           k=j+1;
          
        }
        return Listoflist;
    }
}
