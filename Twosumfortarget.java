class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(i=0;i<nums.length;i++)
        {
            j=target-nums[i];
            if(hmap.containsKey(j))
            {
                return new int[]{hmap.get(j),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[]{};
    }
}
