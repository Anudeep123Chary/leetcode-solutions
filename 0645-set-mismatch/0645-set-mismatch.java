class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            }
            else {
                map.put(num, 1);
            }
        }
        int[] mismatch = new int[2];
        for(int i=1; i<=nums.length; i++){
            if(!map.containsKey(i)){
                mismatch[1] = i;
            }
            else if(map.get(i) == 2) {
                mismatch[0] = i;
            }
        }
        return mismatch;
    }
}