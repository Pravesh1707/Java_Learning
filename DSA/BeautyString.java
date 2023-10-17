package DSA;

import java.util.HashMap;

public class BeautyString {
    
    public static void main(String[] args) {
        String s="babbb";
        int ans = beautySum(s);
        System.out.println(ans);
    }
        public static int beautySum(String s) {
            int var=Integer.MIN_VALUE;
            for(int i=0;i<s.length()-1;i++){
                for(int j=i+1;j<=s.length();j++){
                    String a = s.substring(i,j);
                    HashMap<Character,Integer> hm = new HashMap<>();
                    for(int k=0;k<a.length();k++){
                        if(hm.containsKey(a.charAt(k))){
                            hm.put(a.charAt(k),hm.get(a.charAt(k))+1);
                        }
                        else{
                            hm.put(a.charAt(k),1);
                        }
                    }
                    int max =Integer.MIN_VALUE;
                    int min=Integer.MAX_VALUE;
                    for(int k:hm.values()){
                        if(max < k){
                            max = k;
                        }
                        if(min > k){
                            min=k;
                        }
                    }
                    var = Math.max(var,max-min);
                }
            }
            return var;
        }
    }
