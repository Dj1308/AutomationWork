class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,maxarea=0;
        while(i<j){
            int smaller;
            if(height[j]>height[i])
            {
                smaller=height[i];
            }
            else
            {
                smaller=height[j];
            }
            if((j-i)*smaller > maxarea)
            {
                maxarea=(j-i)*smaller;
            }
            i++;
        }
        return maxarea;
    }
}
