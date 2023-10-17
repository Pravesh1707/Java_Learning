package Strings;

public class SortCharacterByFreq {
    public static void main(String[] args) {
        String s  = "bbAa";
        int alp[] = new int[57];
        boolean b_alp[] = new boolean[57];
        int count=0;
        String ans="";
        for(char a : s.toCharArray()){
            if(alp[a-65]==0){
                count++;
            }
            alp[a-65]++; 
        }

        for(int i=0;i<count;i++){
            int max =0;
            char a = ' ';
            for(int j=0;j<alp.length;j++){
                if(alp[j] > max && b_alp[j]==false){
                    max = alp[j];
                    a = (char)(j+65);
                }
            }

            for(int j=0;j<max;j++){
                ans += a;
            }
            b_alp[(int)(a-65)] = true;
        }
        
        System.out.println(ans);
    }
}
