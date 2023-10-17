package Arrays_Ex;

public class Ques {
    public static void main(String[] args) {
        int s=2;
        int n=3;
        int m= 4;

        double res = Math.pow(s,n) % 10;
        double res2 = Math.pow(res,m) % 1000000007;
        System.out.println((int)res2);
    }
}
