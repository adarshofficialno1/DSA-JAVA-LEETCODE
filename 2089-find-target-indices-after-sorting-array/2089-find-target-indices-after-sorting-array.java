class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0;
        int eq=0;
        for (int x : nums) {
            if (x < target) less++;
            else if (x == target) eq++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < eq; i++) {
            ans.add(less + i);
        }
        return ans;
    }
}