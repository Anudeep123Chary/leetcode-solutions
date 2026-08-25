class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        
        int i = 1;

        for(int num: nums) {
            if(num < k*i) {
                continue;
            } else if (num == k*i) {
                i++;
            } else {
                return k*i;
            }
        }
        return k*i;
    }
}