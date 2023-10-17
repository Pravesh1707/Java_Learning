package Sorting;

public class CountingSort {
    public static void main(String[] args) {
        int [] arr = {1,4,1,2,3,2,3,7};
        int n = arr.length;
        int ans[] = sort(n,arr);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
    public static int[] sort(int n, int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }
        int ans[] = new int[n];
        int count[] = new int[max+1];
        for(int i=0;i< arr.length;i++){
            
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            if(count[i] == 0){
                continue;
            }
            else{
                while(count[i] != 0){
                    ans[k++] = i;
                    count[i]--;
                }
            }
        }
        return ans;
    }
}
