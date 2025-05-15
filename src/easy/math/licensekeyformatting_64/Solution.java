package easy.math.licensekeyformatting_64;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder stringBuilder=new StringBuilder();
        int j=0;
        for (int i = s.length()-1; i>=0 ; i--) {
            if(s.charAt(i)!='-'){
                stringBuilder.append(Character.toUpperCase(s.charAt(i)));
            }
        }

        StringBuilder res=new StringBuilder();
        for (int i = 0; i< stringBuilder.length() ; i++) {
            j++;
            if(j%k!=0){
                res.append(stringBuilder.charAt(i));
            }else {
                res.append(stringBuilder.charAt(i));
                if(i!=stringBuilder.length()-1){
                    res.append("-");
                }
            }
        }
        return res.reverse().toString();
    }
}
