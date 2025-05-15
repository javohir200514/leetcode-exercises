package easy.math.lemonadechange_94;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5=0,count10=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
            }else{
                if(bills[i]==10&&count5>0){
                    count10++;
                    count5--;
                }else if(bills[i]==20&&((count5>0&&count10>0)||count5>2)){
                    if(count10==0) count5-=3;
                    else{
                        count10--;
                        count5--;
                    }

                }else return false;
            }
        }
        return true;
    }
}
