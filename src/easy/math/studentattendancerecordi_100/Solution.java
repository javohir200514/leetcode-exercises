package easy.math.studentattendancerecordi_100;

public class Solution {
    public boolean checkRecord(String s) {
        int aCount=0,lCount=0,max=0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(arr[i]=='A'){
                aCount++;
            }
            if(arr[i]=='L'){
                lCount++;
            }else{
                if(lCount>max){
                    max=lCount;
                }
                lCount=0;
            }
            if(lCount>2||aCount>1)return false;
        }
        if(lCount>max){
            max=lCount;
        }
        return aCount<2&&max<3;
    }
}
