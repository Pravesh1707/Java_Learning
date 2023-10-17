package DSA;

import java.util.HashMap;

public class MaxNumAchievableTransferReq1601 {
    public static void main(String[] args) {
        int arr[][]={{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}};
        // [[0,1],[1,0],[0,1],[1,2],[2,0],[3,4]]
        int ans = maximumRequests(arr);
        System.out.println(ans);
    }

    public static int maximumRequests( int[][] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(hm.containsKey(arr[i][j])){
                    hm.put(arr[i][j],hm.get(arr[i][j])+1);
                }
                else{
                    hm.put(arr[i][j],1);
                }
            }
        }
        int sum=0;
        for(int i : hm.keySet()){
            int val = hm.get(i);
            if(val % 2==0){
                sum += val;
            }
        }
        return sum/2;
    }
}
