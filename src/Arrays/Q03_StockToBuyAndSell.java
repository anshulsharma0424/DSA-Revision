package Arrays;

public class Q03_StockToBuyAndSell {

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        if(prices.length == 1) return prices[0];

        int minPrice = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(prices[i] - minPrice, profit);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
