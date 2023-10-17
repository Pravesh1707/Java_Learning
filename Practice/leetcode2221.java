package Practice;

import java.util.*;

public class leetcode2221 {
    
    public static int triangularSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==0){
            return 0;
        }
        int len = nums.length-1;
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> firstRow = new ArrayList<>();
        for(int i:nums){
            firstRow.add(i);
        }
        ans.add(firstRow);
        int j=0;
        while(len > 0){
            List<Integer> listToAdd = new ArrayList<>();
            for(int i=0;i<ans.get(j).size()-1;i++){
                int num = (ans.get(j).get(i) + ans.get(j).get(i+1))%10;
                listToAdd.add(num);
            }
            j++;
            ans.add(listToAdd);
            len--;
        }
        return ans.get(ans.size()-1).get(0);
    }

    public static void main(String[] args) {
        int []nums = {1,2,3,4,5};
        int ans = triangularSum(nums);
        
        System.out.println(ans);
    }
}