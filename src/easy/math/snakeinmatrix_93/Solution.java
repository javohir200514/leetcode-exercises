package easy.math.snakeinmatrix_93;

import java.util.List;

public class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int position=0;
        for (int i = 0; i < commands.size(); i++) {
            switch (commands.get(i)) {
                case "RIGHT" -> position++;
                case "LEFT" -> position--;
                case "DOWN" -> position += n;
                case "UP" -> position -= n;
            }
        }
        return position;
    }
}
