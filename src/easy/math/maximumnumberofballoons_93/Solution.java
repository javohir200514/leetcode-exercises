package easy.math.maximumnumberofballoons_93;

public class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] freq = new int[5];
        for (char c : text.toCharArray()) {
            if (c == 'b') freq[0]++;
            else if (c == 'a') freq[1]++;
            else if (c == 'l') freq[2]++;
            else if (c == 'o') freq[3]++;
            else if (c == 'n') freq[4]++;
        }

        freq[2] /= 2;
        freq[3] /= 2;

        return Math.min(Math.min(Math.min(freq[0], freq[1]), Math.min(freq[2], freq[3])), freq[4]);
    }
}
