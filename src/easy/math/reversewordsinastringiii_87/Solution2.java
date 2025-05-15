package easy.math.reversewordsinastringiii_87;

public class Solution2 {
    public String reverseWords(String s) {
        StringBuilder news=new StringBuilder();
        int left=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                news.append(reverseString(s.substring(left,i))).append(" ");
                left=i;
            }
        }
        return news.append(reverseString(s.substring(left))).toString();

    }
    String reverseString(String s){
        StringBuilder stringBuilder=new StringBuilder();
        return stringBuilder.append(s).reverse().toString();
    }
}
