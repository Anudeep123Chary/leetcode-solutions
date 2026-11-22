class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle = 0;
        int sumDouble = 0;

        for(int n: nums) {
            if(n>9) {
                sumDouble += n;
            } 
            else {
                sumSingle += n;
            }
        }

        if(sumSingle == sumDouble) {
            return false;
        }
        return true;
    }
}