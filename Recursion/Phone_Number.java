package Recursion;

public class Phone_Number {
    public static void main(String[] args) {
        String dig = "23";
        String [] words = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String ans = words[dig.charAt(0)-'0'];
        System.out.print(ans);
    }
}
