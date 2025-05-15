package easy.math.robotreturntoorigin_97;

public class Solution {
    public boolean judgeCircle(String moves) {
        char[] move=moves.toCharArray();
        int x=0,y=0;
        for (int i = 0; i < move.length; i++) {
            if(move[i]=='R') x++;
            else if(move[i]=='L') x--;
            else if(move[i]=='D') y--;
            else y++;
        }
        return x==0&&y==0;
    }
}
