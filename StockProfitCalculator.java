public class StockProfitCalculator {

    // Method to find maximum profit from one buy and one sell
    public static int findMaxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE; // Track minimum price so far
        int maxProfit = 0;                 // Track maximum profit

        // Traverse stock prices
        for(int price : prices) {
            
            // Update minimum price if lower price found
            minPrice = Math.min(minPrice, price);
            
            // Calculate profit if sold today
            int profit = price - minPrice;
            
            // Update maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit; // Return maximum possible profit
    }

    public static void main(String[] args) {
        
        // Sample stock prices per day
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Calculate max profit
        int result = findMaxProfit(prices);

        // Display output
        System.out.println("Maximum Profit: " + result);
    }
}
