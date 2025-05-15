package easy.math.reversewordsinastringiii_87;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder news=new StringBuilder();
        String[] str=s.split(" ");
        for (int i=0;i<str.length-1;i++) {
                news.append(reverseString(str[i])).append(" ");
        }
        return news.append(reverseString(str[str.length-1])).toString();
    }
    String reverseString(String s){
        StringBuilder stringBuilder=new StringBuilder();
        return stringBuilder.append(s).reverse().toString();
    }
}
