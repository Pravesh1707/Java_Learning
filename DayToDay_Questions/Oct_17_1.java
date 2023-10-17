package DayToDay_Questions;

public class Oct_17_1 {
    public static void main(String[] args) {
        int num[] = {2,7,11,15};
        int tar = 9;
        int arr[] = twoSum(num,tar);
        System.out.print("[");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print(arr[arr.length-1]+"]");
    }
    public static int[] twoSum(int arr[], int tar){
        int ans[] = new int[2];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == tar){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
