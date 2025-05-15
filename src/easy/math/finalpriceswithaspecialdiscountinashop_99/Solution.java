package easy.math.finalpriceswithaspecialdiscountinashop_99;

public class Solution {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            prices[i]-=find(prices,i);
        }
        return prices;
    }
    public int find(int[] arr,int j){
        int a=arr[j];
        for (int i = j+1; i <arr.length ; i++) {
            if(a>=arr[i]){
                return arr[i];
            }
        }
        return 0;
    }
}
