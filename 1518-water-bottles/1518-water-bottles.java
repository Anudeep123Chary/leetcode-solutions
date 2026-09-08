class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
       int drinks = numBottles;
       int emptyBottles = numBottles;

       while(emptyBottles >= numExchange) {
            drinks += emptyBottles/numExchange;
            emptyBottles = emptyBottles/numExchange + emptyBottles%numExchange;
       }
       return drinks;
    }
}