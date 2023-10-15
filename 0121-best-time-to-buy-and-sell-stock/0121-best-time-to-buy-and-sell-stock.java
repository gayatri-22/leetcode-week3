class Solution {
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][2];
        for(int i=0;i<prices.length;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<2;k++)
                    dp[i][j][k]=-1;
        return maximumProfit(prices,0,1,1, new HashMap<String,Integer>(), dp);
}

private int maximumProfit(int[] prices,int currentDay, int canBuy, int transCount, HashMap<String,Integer> memo, int[][][] dp){

    if(currentDay>=prices.length || transCount==0)
       return 0;

    int ans=0;

    if(dp[currentDay][canBuy][transCount]!=-1)
       return dp[currentDay][canBuy][transCount];

    if(canBuy==1){
        int idle = maximumProfit(prices, currentDay+1, canBuy, transCount, memo, dp);
        int buy = -prices[currentDay] + maximumProfit(prices, currentDay+1,0,1,memo,dp);
        ans= Math.max(idle,buy);
    }
    else{
        int idle = maximumProfit(prices, currentDay+1, canBuy, transCount, memo, dp);
        int sell = prices[currentDay]+maximumProfit(prices, currentDay+1, 1, transCount-1, memo,dp);
        ans=Math.max(idle,sell);
    }
    dp[currentDay][canBuy][transCount]=ans;
      return dp[currentDay][canBuy][transCount];
}


}