package easy.math.maximumdifferencebetweenevenandoddfrequencyi_100;

public class Solution {
    public int maxDifference(String s) {
        int count=0,j=0,max=0,min=Integer.MAX_VALUE;
        char[] arr=new char[26];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max&&arr[i]%2!=0){
                max=arr[i];
            }
            if(arr[i]>0&&arr[i]%2==0&&arr[i]<min){
                min=arr[i];
            }
        }
        return max-min;
    }
}
