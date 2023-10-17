package DSA;

public class MinPathDP {

    public static void main(String[] args) {
        int arr[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int dp[][]= new int[arr.length][arr.length];
        int a = minpath(arr,0,0,dp);
        System.out.print(a);
    }
    public static int minpath(int arr[][],int i,int j,int dp[][]) {
        
        if(i>=arr.length || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==arr.length -1 && j== arr[0].length-1){
            return arr[i][j];
        }

        if(dp[i][j]!=0){
            return dp[i][j];
        }

        int right = minpath(arr, i,j+1,dp);
        int bottom = minpath(arr,i+1,j,dp);
        dp[i][j] = arr[i][j] + Math.min(right, bottom);
        return arr[i][j] + Math.min(right, bottom);
    }

}
