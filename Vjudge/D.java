package Vjudge;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        int arr[] = {7,3,5,2};
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        List<Integer> a = new ArrayList<>();
        for(int i: arr){
            a.add(i);
            Collections.sort(a);
            if(a.size()%2==0){
                float r= a.get((a.size()-1)/2);
                float l = a.get((a.size()/2));
                float mid = (r + l)/2;
                System.out.println(mid);
            }
            else{
                System.out.println((float)(a.get(a.size()/2)));
            }
        }
    }
}
