class Solution {
    public int maxProfit(int[] prices) {
        int lenPrices = prices.length;
        int maxProf = 0;
        int currentMaxProf = 0;

        for(int i=1;i<lenPrices;i++){
            currentMaxProf += prices[i]-prices[i-1]; 

            if(currentMaxProf<0){
                currentMaxProf = 0;
            }

            if(currentMaxProf>maxProf)
                maxProf = currentMaxProf;
        }
        return maxProf;
    }
}