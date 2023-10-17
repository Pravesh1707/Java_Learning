package BitManipulation;

import java.util.Scanner;

public class OR_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int a[] = {1,2,3,4,5,7,8};
        int ans = 0;
        // for(int i =0;i<n;i++){
        //     a[i] = sc.nextInt();
        // }
        for(int i : a){
            ans =ans ^ i;
        }
        System.out.println(ans-1);
    }
}
