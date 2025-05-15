package easy.math.maximum69number_100;

public class Solution {
    public int maximum69Number (int num) {
        int[] arr=new int[6];
        int i=0;
        while (num!=0){
            arr[i++]=(num%10);
            num/=10;
        }
        for (int j = i-1; j >=0 ; j--) {
            if(arr[j]==6){
                arr[j]=9;
                break;
            }
        }
        int newnum=0;
        for (int j = i-1; j >=0 ; j--) {
            newnum+= (int) ( arr[j]*Math.pow(10,i-1));
            i--;
        }
        return newnum;
    }
}
