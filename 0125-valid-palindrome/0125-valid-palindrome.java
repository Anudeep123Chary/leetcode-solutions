class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        int n = s.length();

        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = sb.length() - 1;

        while(left < right) {

            if(sb.charAt(left++) != sb.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}