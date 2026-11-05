
class Solution {
    int[][] memo;

    public int findTargetSumWays(int[] nums, int target) {
        memo = new int[nums.length][2001];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return solve(nums, 0, 0, target);
    }

    private int solve(int[] nums, int index, int sum, int target) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        if (memo[index][sum + 1000] != -1) {
            return memo[index][sum + 1000];
        }

        int add = solve(
            nums, index + 1, sum + nums[index], target
        );

        int subtract = solve(
            nums, index + 1, sum - nums[index], target
        );

        memo[index][sum + 1000] = add + subtract;

        return memo[index][sum + 1000];
    }
}
