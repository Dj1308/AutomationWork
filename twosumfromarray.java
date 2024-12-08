class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=i+1;
        while( i< numbers.length-1)
        {
            if((numbers[i]+numbers[j])==target)
            {
                break;
            }
            else
            {
                if(j==numbers.length-1)
                {
                    i++;
                    j=i+1;
                }
                else
                {
                    j++;
                }
            }
        }
    return new int[]{i+1,j+1};
    }
}