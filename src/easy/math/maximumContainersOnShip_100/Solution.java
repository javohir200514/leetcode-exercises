package easy.math.maximumContainersOnShip_100;

public class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        if(n*n*w<maxWeight){
            return n*n;
        }

        return maxWeight/w;
    }
}
