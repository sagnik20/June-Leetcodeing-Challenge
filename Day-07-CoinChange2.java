class Solution {
    private Integer[][] dp;
    public int change(int amount, int[] coins) {
        dp = new Integer[coins.length + 1][amount + 1];
        return change(amount,coins,0);
    }
    
    public int change(int amount, int[] coins, int i){
        if(amount<0)return 0;
        if(amount==0)return 1;
        if (dp[i][amount] != null) {
            return dp[i][amount];
        }
        if(i==coins.length && amount >0)return 0;
        dp[i][amount] = change(amount-coins[i],coins,i)+change(amount,coins,i+1);
        return dp[i][amount];
    }
}
