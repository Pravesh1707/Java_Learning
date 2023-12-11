package Practice;

import java.util.*;

public class leetcode2264 {
    
    public static String largestGoodInteger(String num) {
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<num.length()-2;i++){
            int k=i+1;
            while(k<=i+2){
                if(num.charAt(i)==num.charAt(k)){
                    k++;
                    if((k-i+1)==3){
                        al.add(num.substring(i,k+1));
                    }
                }
                else{
                    break;
                }
            }
        }
        if(al.size()==1){
            return al.get(0);
        }
        int max = 0;
        for(int i=0;i<al.size();i++){
            max = Math.max(max,Integer.valueOf(al.get(i)));
        }
        if(max ==0){
            return "000";
        }
        return al.size()==0?"":String.valueOf(max);
    }

    public static void main(String[] args) {
        String s = "42352338";
        System.out.println(largestGoodInteger(s));
    }
}