class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(!nums.size()) return 0;
        sort(nums.begin(), nums.end());
        int count = 1;
        int maxCount = 1;
        for(int i=1; i<nums.size(); i++){
            int prev = nums[i-1];
            if(nums[i] == prev){
                continue;
            }
            if(nums[i] == prev + 1){
                count++;
            }else{
                count = 1;
            }
            maxCount = max(count, maxCount);
        }

        return maxCount;
    }
};
