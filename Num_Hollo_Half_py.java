public class Num_Hollo_Half_py {
    public static void main(String[] args) {
        
        int n=5;
        for(int i=0;i<n;i++){
            int val = 1;
            
            if(i == n-1){
                for(int j=0;j<n;j++){
                    System.out.print(val+" ");
                    val++;
                }
            }
            else{
                for(int j=0;j<=i;j++){
                    if(j==0 || j == i){
                        System.out.print(val+" ");
                    }

                    else{
                        for(int s=0;s<i-1;s++){
                            System.out.print(" ");
                        }
                    }
                    val++;
                }
            }
            System.out.println();
        }
    }
}
