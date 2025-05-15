package easy.math.capitalizethetitle_91;

public class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder s=new StringBuilder();
        String[] strs=title.split(" ");
        for (int i = 0; i <strs.length; i++) {
            if(strs[i].length()==1||strs[i].length()==2){
                s.append(strs[i].toLowerCase());
                if(i!=strs.length-1) s.append(" ");
            }else {
                s.append(Character.toUpperCase(strs[i].charAt(0)))
                        .append(strs[i].substring(1).toLowerCase());
                if(i!=strs.length-1) s.append(" ");
            }
        }
        return s.toString();
    }
}
