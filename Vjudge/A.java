package Vjudge;

import java.util.PriorityQueue;
import java.util.Scanner;

public class A {
    
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s = sc.nextLine();
            String st[] = s.split(" ");
            if(st[0].equals("insert")){
                pq.add(Integer.valueOf(st[1]));
            }
            else if(s.equals("getMin")){
                if(pq.size()>0){
                    System.out.println(pq.peek());
                }
                else{
                    System.out.println("Empty");
                }
            }
            else if(s.equals("delMin")){
                pq.remove();
            }
        }
		
	}
}
