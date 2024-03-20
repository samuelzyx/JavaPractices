class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProf = 0;
        int currentProf = 0;
        
        for (int i=0; i< prices.length-1; i++){

            if(prices[i]<buy){
                buy = prices[i];
            }

            currentProf = (prices[i+1]-buy);
            
            if (currentProf > 0){
                maxProf += currentProf;
                buy = Integer.MAX_VALUE;
            }
        }
        return maxProf;
    }
}