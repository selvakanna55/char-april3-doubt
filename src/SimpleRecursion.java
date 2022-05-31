

/* Online Java Compiler and Editor */

import java.util.*;

public class SimpleRecursion {
    static int f(int i, int n) {
        if (i > n) {
            return 0;
        }
        int curr = i * f(i + 1, n);
        return curr;
    }

    public static void main(String args[]) {
        int n = 3; // 1+2+3
        System.out.println(f(1, n));
    }
}
