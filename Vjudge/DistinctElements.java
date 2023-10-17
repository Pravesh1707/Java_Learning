package Vjudge;

import java.util.*;

public class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<arr.length;j++){
                arr[j] = sc.nextInt();
            }
            
            for(int j=0; j<arr.length-k+1;j++){
                HashSet<Integer> st = new HashSet<>();
                for(int l=j;l<j+k;l++){
                    st.add(arr[l]);
                }
                System.out.print(st.size()+" ");
            }
            System.out.println(); 
        }
    }
}
// -5 -1 4 8 -5 -3 -4 7 4 -4 0 8 0 -2 3 2 5 