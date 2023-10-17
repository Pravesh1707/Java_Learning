public class Floyds_Patt {
    public static void main(String[] args) {
        int n = 8;
        int val=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}
