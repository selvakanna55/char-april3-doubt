

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class InfinityStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int num1 = s1.charAt(i) - '0';
            int num2 = s2.charAt(i) - '0';
            int way1 = Math.abs(num1 - num2);
            int way2 = 10 - way1;
            ans += Math.min(way1, way2);
        }
        System.out.println(ans);
        // Your code here
    }
}