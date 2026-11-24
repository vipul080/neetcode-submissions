//memorisation
class Solution {
public:
    int solve(vector<int>& cost, int i, vector<int>& memo){
        if(i >= cost.size()){
            return 0;
        }

        if(memo[i]!=-1){
            return memo[i];
        }

        int oneStep = cost[i] + solve(cost, i+1, memo);
        int twoStep = cost[i] + solve(cost, i+2, memo);



        return memo[i] = min(oneStep, twoStep);
    }
    int minCostClimbingStairs(vector<int>& cost) {
        vector<int> memo(cost.size(), -1);
        return min(solve(cost, 0, memo), solve(cost, 1, memo));
    }
};
