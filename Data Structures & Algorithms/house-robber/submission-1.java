// bottom-up DP solution

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[nums.length+2];

        for(int i = n-1; i >=0 ; i--){
            int robCurrent = nums[i] + dp[i+2];
            int skipCurrent = dp[i+1];
            
            dp[i] = Math.max(robCurrent, skipCurrent);
        }

        return dp[0];
    }
}