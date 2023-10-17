public class Rev_Alphabet_Patt {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            int val=1;
            for(int j=val;j<i+1;j++){
                char ans = (char)(j+'A'-1);
                System.out.print(ans);
                val++;
            }
            
            for(int j=val;j>=1;j--){
                char ans = (char)(j+'A'-1);
                System.out.print(ans);
                val--;
            }
            System.out.println();
        }
    }
}
