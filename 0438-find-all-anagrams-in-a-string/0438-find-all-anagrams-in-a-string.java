class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] count = new int[26];

        // Frequency of characters required from p
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int remaining = p.length();

        while (right < s.length()) {
            char c = s.charAt(right);

            // If this character was still needed
            if (count[c - 'a'] > 0) {
                remaining--;
            }

            count[c - 'a']--;
            right++;

            // Keep window size <= p.length()
            if (right - left > p.length()) {
                char leftChar = s.charAt(left);

                count[leftChar - 'a']++;

                // This character is now needed again
                if (count[leftChar - 'a'] > 0) {
                    remaining++;
                }

                left++;
            }
            // Window contains exactly the characters of p
            if (remaining == 0) {
                list.add(left);
            }
        }
        return list;
    }
}