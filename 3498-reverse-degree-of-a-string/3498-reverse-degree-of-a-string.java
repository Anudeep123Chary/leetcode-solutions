class Solution {
    public int reverseDegree(String s) {
        int revDeg = 0;
        for(int i=0; i<s.length(); i++) {
            revDeg += (26 - (s.charAt(i) - 'a')) * (i+1);
        }
        return revDeg;
    }
}