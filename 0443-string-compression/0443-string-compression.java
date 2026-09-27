class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while(i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
            while(i < chars.length && currentChar == chars[i]) {
                count++;
                i++;
            }
            chars[index++] = currentChar;

            if(count > 1) {
                String countStr = Integer.toString(count);

                for(char digit: countStr.toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }
        return index;
    }
}