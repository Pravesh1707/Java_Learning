package Practice;

public class leetcode2079 {
    
    public static void main(String[] args) {
        int arr[] ={2,2,3,3};
        int ans = wateringPlants(arr,5);
        System.out.println(ans);
    }
        public static int wateringPlants(int[] plants, int capacity) {
            int ans=1;
            
            // int k=1;
            int size = capacity-plants[0];
            for(int i=1;i<plants.length;i++){
                if(size >= plants[i]){
                    ans++;
                    size -= plants[i];
                    
                }
                else{
                    size = capacity-plants[i];
                    ans +=(plants.length-(plants.length-i))*2 + 1;
                }
            }
            return ans;
        }
}
