class Solution {
    public boolean isPalindrome(String s) {
        String phrase = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = phrase.length()-1;

        while(left<=right){
            if(phrase.charAt(left) != phrase.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}