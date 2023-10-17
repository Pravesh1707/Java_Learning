package Arrays_Ex;


public class Kadane_Algo {
    public static void main(String[] args) {
        int [] arr={-4,-5,-6,-7,-8,-2,-4,-1};
        int max = calc(arr);
        System.out.println(max);
    }
    //for all -ve elements
    /*public static int calc(int []a) {
        
        int max= Integer.MIN_VALUE;
        int currMax = a[0];

        for(int i=1;i< a.length;i++){
            if(currMax > a[i]){
                currMax=currMax;
            }else{
                currMax = a[i];
            }
            max = Math.max(currMax,max);
        }

        return max;
    }
    */


    // for both +ve and -ve elements
    public static int calc(int []a) {
        
        int max= Integer.MIN_VALUE;
        int currMax = 0;

        for(int i=1;i< a.length;i++){
            currMax+=a[i];
            if(currMax < 0 ){
                currMax = 0;
            }
            max = Math.max(currMax,max);
        }

        return max;
    }
}
