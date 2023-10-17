package Recursion;

public class SumTillOneDig {
    public static void main(String[] args) {
        int x = 1234;
        int ans = Recursion(x);
        System.out.println(ans);
    }

    public static int Recursion(int x){
        int temp = x;
        x=0;
        while(temp > 0){
            x = x + (temp%10);
            temp /=10;
        }
        
        return x > 9 ? Recursion(x) : x;

    }
}
