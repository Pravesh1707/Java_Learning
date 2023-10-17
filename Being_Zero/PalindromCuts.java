package Being_Zero;

import java.util.*;

public class PalindromCuts {
    public static int minPalindromeCuts(String str) {
        int n = str.length();
        boolean[][] isPalindrome = new boolean[n][n];
        
        // Initialize the isPalindrome matrix
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }
        
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i < n - length + 1; i++) {
                int j = i + length - 1;
                
                if (length == 2) {
                    isPalindrome[i][j] = (str.charAt(i) == str.charAt(j));
                } else {
                    isPalindrome[i][j] = (str.charAt(i) == str.charAt(j)) && isPalindrome[i + 1][j - 1];
                }
            }
        }
        
        int[] cuts = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (isPalindrome[0][i]) {
                cuts[i] = 0;
            } else {
                cuts[i] = Integer.MAX_VALUE;
                for (int j = 0; j < i; j++) {
                    if (isPalindrome[j + 1][i] && cuts[j] + 1 < cuts[i]) {
                        cuts[i] = cuts[j] + 1;
                    }
                }
            }
        }
        
        return cuts[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        for (int t = 1; t <= T; t++) {
            String input = scanner.nextLine();
            int minCuts = minPalindromeCuts(input);
            System.out.println("CASE #" + t + ": " + minCuts);
        }
        
        scanner.close();
    }
}
