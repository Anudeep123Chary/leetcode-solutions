class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int vowel = 0;
        int consonant = 0;
        
        for( char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet() ) {

            char ch = entry.getKey();
            int freq = entry.getValue();

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel = Math.max(vowel, freq);
            } else {
                consonant = Math.max(consonant, freq);
            }
        }
        return vowel+consonant;
    }
}