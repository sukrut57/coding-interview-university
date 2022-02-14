public class BestTimeToBuyAndSellStockLeetCode {
    public static void main(String[] args){

        int[] stocks=new int[] {7,1,5,3,6,4};
        int maxProfit=0;
        int buyPrice=stocks[0];

        for(int i=0;i<stocks.length;i++){
            if(buyPrice > stocks[i]) buyPrice=stocks[i];
            else{
                int profit=stocks[i] - buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
        }
        System.out.println(maxProfit);
    }    
    
}
