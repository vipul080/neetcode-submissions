// top-down DP solution


class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(nums, 0, dp);
    }

    public int solve(int[] nums, int index, int[] dp){
        if(index >= nums.length){
            return 0;
        }
        if (dp[index] != -1) return dp[index];

        int robCurrent = nums[index] + solve(nums, index + 2, dp);

        int skipCurrent = solve(nums, index + 1, dp);

        return dp[index] = Math.max(robCurrent, skipCurrent);
    }
}