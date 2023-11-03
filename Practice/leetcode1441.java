package Practice;

import java.util.ArrayList;
import java.util.List;

public class leetcode1441 {
    
    public static void main(String[] args) {
        int arr[] = {1,3};
        int n = 3;
        List<String> ans = buildArray(arr, n); 
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int num=1;
        int i=0;
        while(i<=n && i<target.length){
            ans.add("Push");
            if(target[i]!=num){
                ans.add("Pop");
            }
            else{
                i++;
            }
            num++;
        }
        return ans;
    }
}