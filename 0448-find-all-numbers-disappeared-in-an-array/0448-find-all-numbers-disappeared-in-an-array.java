class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> notExist = new ArrayList<>();
        for(int num: nums){
            int idx = Math.abs(num) - 1;
            if(nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                notExist.add(i+1);
            }
        }
        return notExist;
    }
}