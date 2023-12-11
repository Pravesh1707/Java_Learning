package Practice;

import java.util.HashMap;

public class leetcode1287 {
    public static void main(String[] args) {
        int arr[]={6700,8858,8858,8858,8858};
        int ans = findSpecialInteger(arr);
        System.out.println(ans);
    }
    public static int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i ,hm.getOrDefault(i,0)+1);
        }
        int count = (int)(arr.length*0.25);
        // return count;
        int ans=0;
        
        for(int i : hm.keySet()){
            if(hm.get(i) > count){
                ans=i;
            }
        }
        return ans;
    }
}
