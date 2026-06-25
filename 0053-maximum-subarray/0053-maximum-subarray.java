class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0], maxSum = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(sum + nums[i] > nums[i]){
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}