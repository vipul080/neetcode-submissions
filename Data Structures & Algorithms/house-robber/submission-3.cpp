//memorisation
class Solution {
public:
    int solve(vector<int>& nums, int i, vector<int>& memo){
        if(i >= nums.size()){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        int robCurrent = nums[i] + solve(nums, i+2, memo);
        int skipCurrent = solve(nums, i+1, memo);

        return memo[i] = max(robCurrent, skipCurrent);
    }
    int rob(vector<int>& nums) {
        vector<int> memo(nums.size(), -1);
        return solve(nums, 0, memo);
    }
};
