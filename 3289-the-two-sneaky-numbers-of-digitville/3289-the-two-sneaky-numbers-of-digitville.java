class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        int[] arr = new int[2];
        int idx = 0;
        for(int num : nums) {
            if(!set.add(num)) {
                arr[idx++] = num;
            }
        }
        return arr;
    }
}