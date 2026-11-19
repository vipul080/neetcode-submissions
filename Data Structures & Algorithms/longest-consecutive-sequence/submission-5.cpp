//optimised version O(n)
class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> s(nums.begin(), nums.end());
        int maxCount = 0;
        for(int x : s){
            if(s.find(x-1) == s.end()){
                int curr = x;
                int count = 0;

                while(s.count(curr)){
                    count++;
                    curr++;
                }
                maxCount = max(count, maxCount);
            }
        }

        return maxCount;
    }
};
