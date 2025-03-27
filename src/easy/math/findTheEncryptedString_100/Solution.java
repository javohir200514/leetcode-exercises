package easy.math.findTheEncryptedString_100;

public class Solution {
    public String getEncryptedString(String s, int k) {
        k=k%s.length();
        StringBuilder stringBuilder=new StringBuilder();


        stringBuilder.append(s.substring(k));
        stringBuilder.append(s.substring(0,k));

        return stringBuilder.toString();
    }
}
