//Leetcode 136 - Single Number
//Approach: XOR
//Time: O(n), Space: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans = ans^nums[i];
        }
        return ans;

    }
}
