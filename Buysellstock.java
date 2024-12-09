class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],sell=prices[prices.length-1],profit=0;
        for(int i=0,j=prices.length-1;i<j;i++,j--)
        {
             System.out.println("Value of i and j is: " + i + "," + j);
             
            if(prices[i] < buy)
            {
                buy = prices[i];
            }
            if(sell < prices[j])
            {
                sell = prices[j];
            }
            if(buy < sell)
            {
                System.out.println("Value of buy and sell is: " + buy + "," + sell);
                profit = sell-buy;
                 System.out.println("Value of profit is: " + profit);
            }
           
        }
        return profit;
    }
}
