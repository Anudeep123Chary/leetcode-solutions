class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int greatestAmount = 0;

        for (int var: candies) {
            if(greatestAmount < var) {
                greatestAmount = var;
            }
        }

        for(int i=0; i<candies.length; i++) {

            if(candies[i]+extraCandies >= greatestAmount) {
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }
}