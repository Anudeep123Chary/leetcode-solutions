class Solution {
    public int countKeyChanges(String s) {
        String str = s.toLowerCase();
        char prev = str.charAt(0);
        int count = 0;
        for(int i=1; i<str.length(); i++) {
            if(prev != str.charAt(i)){
                count++;
                prev = str.charAt(i);
            }
        }
        return count;
    }
}