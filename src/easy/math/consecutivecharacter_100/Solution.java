package easy.math.consecutivecharacter_100;

public class Solution {
    public int maxPower(String s) {
        int count=1,max=0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                if(max<count){
                    max=count;
                }
                count=1;
            }
        }
        if(max<count){
            max=count;
        }
        return max;
    }
}
