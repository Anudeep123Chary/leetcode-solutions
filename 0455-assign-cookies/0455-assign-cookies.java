import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int gp = 0;
        int cp = 0;

        while(gp < g.length && cp < s.length){

            if(s[cp] >= g[gp]){
                gp++;
            }
            cp++;
        }
        return gp;
    }
}