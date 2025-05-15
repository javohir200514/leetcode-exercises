package easy.math.checkifwordequalssummationoftwowords_100;

public class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return toNumber(firstWord)+toNumber(secondWord)==toNumber(targetWord);

    }
    public int toNumber(String styr){
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < styr.length(); i++) {
            s.append(styr.charAt(i)-'a');
        }
        return Integer.parseInt(s.toString());
    }
}
