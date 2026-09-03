class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double smallest = Double.MAX_VALUE;
        while(left<right) {
            double number = (nums[left] + nums[right])/2.0;
            if(smallest > number){
                smallest = number;
            }
            left++;
            right--;
        }
        return smallest;
    }
}