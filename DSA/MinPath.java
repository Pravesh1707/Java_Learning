package DSA;

public class MinPath {
    
    public static void main(String[] args) {
        int arr[][] ={{1,3,1},{1,5,1},{4,2,1}};
        int a = minpath(arr,0,0);
        System.out.print(a);
    }
    public static int minpath(int arr[][],int i,int j) {
        
        if(i>=arr.length || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==arr.length -1 && j== arr[0].length-1){
            return arr[i][j];
        }
        int right = minpath(arr, i,j+1);
        int bottom = minpath(arr,i+1,j);
        return arr[i][j] + Math.min(right, bottom);
    }
}
