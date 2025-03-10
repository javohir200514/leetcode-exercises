package easy.math.truncateSentence_83;

public class Solution {
    public String truncateSentence(String s, int k) {
        int count=0;
        StringBuilder sb=new StringBuilder() ;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
            if(count!=k){
                sb.append(s.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
}
