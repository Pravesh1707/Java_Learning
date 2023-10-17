package DSA;

import java.util.HashMap;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int arr1[]= {1,1,1,2,2,3,5,5,5,5,7};
        int arr2[] = {1,1,2,2,2,2,2,2,2,3,5,5,7};
        intersection(arr1,arr2);
    }
    public static void intersection(int a[],int b[]) {
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        
        for(int i : a){
            if(hm1.containsKey(i)){
                hm1.put(i,hm1.get(i)+1);
            }
            else{
                hm1.put(i,1);
            }
        }

        for(int i : b){
            if(hm2.containsKey(i)){
                hm2.put(i,hm2.get(i)+1);
            }
            else{
                hm2.put(i,1);
            }
        }

        for(int i : hm1.keySet()){
            if(hm1.containsKey(i) && hm2.containsKey(i)){
                int min = Math.min(hm1.get(i),hm2.get(i));
                for(int j=0;j<min;j++){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
