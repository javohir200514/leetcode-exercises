package easy.math.accountBalanceAfterRoundedPurchase_100;

public class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int a=purchaseAmount,b=purchaseAmount;
        while(a%10!=0){
            a++;
        }

        while(b%10!=0){
            b--;
        }
        if(Math.abs(purchaseAmount-a)>Math.abs(purchaseAmount-b)){
            return 100-b;
        }
        return 100-a;
    }
}
