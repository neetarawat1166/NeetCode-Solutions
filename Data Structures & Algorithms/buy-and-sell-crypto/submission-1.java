class Solution {
    public int maxProfit(int[] prices) {

        int a= prices[0];
        int b= 0;

        for (int i=1; i<prices.length;i++) {
            if (prices[i]<a) {
                a=prices[i];
            }

            b = Math.max(b,prices[i] - a);
        }

        return b;
    }
}