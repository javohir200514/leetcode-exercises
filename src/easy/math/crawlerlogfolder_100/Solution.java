package easy.math.crawlerlogfolder_100;

public class Solution {
    public int minOperations(String[] logs) {
        int folder = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (folder > 0) folder--;
            } else if (!log.equals("./")) {
                folder++;
            }
        }
        return folder;
    }
}
