class Solution {
    public int thirdMax(int[] nums) {
        long third = Long.MIN_VALUE,
            sec = Long.MIN_VALUE,
            larg = Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==third ||nums[i]==sec ||nums[i]==larg)
            continue;
            if(nums[i] >larg) {
                third =sec;
                sec= larg;
                larg =nums[i];
            } else if(nums[i]>sec) {
                third= sec;
                sec =nums[i];
            } else if(nums[i] > third) {
                third=nums[i];
            }
        }
        return third == Long.MIN_VALUE ? (int) larg : (int) third;
    }
}