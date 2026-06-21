class Solution {
    public int[] findErrorNums(int[] nums) {
        boolean[] map = new boolean[nums.length];
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map[nums[i]-1]){
                //operation
                result[0] = nums[i];
            }
            else {
                map[nums[i]-1] = true;
            }
        }
        for(int i=0;i<map.length;i++){
            if(map[i]==false){
                result[1]=i+1;
            }
        }
        return result;
    }
}