
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        //vector<int> answer(nums.size(), 0);
        vector<int> left(nums.size(), 0);
        vector<int> right(nums.size(), 0);
        int product = 1;
        for(int i=0; i<nums.size(); i++){
            left[i] = product;
            product *= nums[i]; //[1, 1, 2, 8]
        }
        product = 1;

        for(int i=nums.size()-1; i>=0; i--){
            right[i] = product;
            product *= nums[i]; //[48, 24, 6, 1]
        }

        for(int i=0; i<nums.size(); i++){
            nums[i] = left[i] * right[i];
        }

        return nums;
    }
};
