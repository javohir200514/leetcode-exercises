package easy.math.zigzaggridtraversalwithskip_100;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <grid.length ; i++) {
            if(grid[i].length%2==0){
                if(i%2==0){
                    for(int j=0;j<grid[i].length;j++){
                        if(j%2==0) numbers.add(grid[i][j]);
                    }
                }else{
                    for (int j =grid[i].length-1; j >=0 ; j--) {
                        if(j%2!=0) numbers.add(grid[i][j]);
                    }
                }
            }else{
                if(i%2==0){
                    for(int j=0;j<grid[i].length;j++){
                        if(j%2==0) numbers.add(grid[i][j]);
                    }
                }else{
                    for (int j =grid[i].length-1; j >=0 ; j--) {
                        if(j%2!=0) numbers.add(grid[i][j]);
                    }
                }
            }
        }
        return numbers;
    }
}
