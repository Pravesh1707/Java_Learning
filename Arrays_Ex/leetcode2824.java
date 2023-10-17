package Arrays_Ex;

import java.util.*;
import java.util.Arrays;

public class leetcode2824 {
        
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-6,2,5,-2,-7,-1,3));
        int ans = countPairs(nums,-2);
        System.out.println(ans);
    }

    public static int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                if((nums.get(i) + nums.get(j)) < target){
                    count += 1;
                }
            }
        }
        return count;
    }
}
