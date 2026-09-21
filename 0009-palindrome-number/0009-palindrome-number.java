class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int store = 0;
        while(temp > 0) {
            store = store*10 + temp%10 ;
            temp /= 10;
        }
        if(x == store){
            return true;
        }
        return false;
    }
}