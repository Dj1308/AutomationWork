class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(nums[i]))
            {
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
            else
            {
                hmap.put(nums[i],1);
            }
        }
        int flag1=0;
        int flag2=0;
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet())
        {
            if(flag2 < entry.getValue())
            {
                flag1 = entry.getKey();
            }
        } 
    return flag1;
    }
}