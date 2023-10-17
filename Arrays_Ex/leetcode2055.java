package Arrays_Ex;

public class leetcode2055 {
    public static void main(String[] args) {
        String s = "**|**|***|";
        int queries[][] = {{2,5},{5,9}};
        int ans[]=platesBetweenCandles(s,queries);
        for(int i:ans){
        System.out.print(i+" ");}
    }
    public static  int[] platesBetweenCandles(String s, int[][] queries) {
        int ans[] = new int[queries.length];
        int k=0;
        for(int i=0;i<queries.length;i++){
            int low = queries[i][0];
            int high = queries[i][1];
            int max = -1;
            int min = s.length();
            for(int j=low;j<=high;j++){
                if(s.charAt(j)=='|'){
                    if(max < j){
                        max = j;
                    }
                    if(min > j){
                        min = j;
                    }
                }
            }
            int count=0;
            if(max<min){
                ans[k++]=0;
            }
            else{
            for(int j=min;j<max;j++){
                if(s.charAt(j)=='*'){
                    count++;
                }
            }
            ans[k++] = count;
            }
        }
        return ans;
    }
}
