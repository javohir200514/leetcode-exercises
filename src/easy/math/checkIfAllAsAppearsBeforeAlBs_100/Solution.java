package easy.math.checkIfAllAsAppearsBeforeAlBs_100;

public class Solution {
    public boolean checkString(String s) {
        int index=0,count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'){
                index=i;
                count++;
            }
        }
        if(count==0) return true;
        return (count==index+1);
    }
}
