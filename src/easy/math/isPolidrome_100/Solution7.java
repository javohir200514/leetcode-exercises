package easy.math.isPolidrome_100;

public class Solution7 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x<10){
            return true;
        }
        int count=0,sum=0,b=x,c=x;
        while(x!=0){
            count++;
            x/=10;
        }
        for(int i=1;i<=count;i++){
            sum=sum*10+b%10;
            b/=10;
        }
        if(sum==c){
           return (true);
        }else{
           return (false);
        }

    }
}
