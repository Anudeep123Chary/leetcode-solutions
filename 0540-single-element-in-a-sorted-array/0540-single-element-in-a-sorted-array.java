class Solution {
    public int singleNonDuplicate(int[] nums) {
        int num = 0;

        for(int number : nums) {
            num ^= number;
        }
        return num;
    }
}