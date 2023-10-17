package DayToDay_Questions;

public class Oct_17_2 {
    public static void main(String[] args) {
        int num[] = {2,5,6,8,1};
        int ans = twoSum(num);
        System.out.println(ans);
    }
    public static int twoSum(int arr[]){
        int ans= Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int max = arr[i]*arr[j];
                if(max >= ans){
                    ans = max;
                }
            }
        }
        return ans;
    }
}
