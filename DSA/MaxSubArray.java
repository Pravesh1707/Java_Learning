package DSA;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3,7};
        int max =0;
        for(int i=0;i<arr.length-2;i++){
            int sum =0;
            for(int j=i;j<i+3;j++){
                sum += arr[j];
            }
            max = Math.max(max,sum);
        }
        System.out.println(max);
    }
}
