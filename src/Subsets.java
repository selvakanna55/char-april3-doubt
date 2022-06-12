

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            TreeSet<String> ans = new TreeSet<>();

            for (int i = 1; i < (1 << n); i++) {
                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) != 0)
                        sb.append(arr[j] + " ");
                }
                if (i != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                    ans.add(sb.toString());
                }
            }

            System.out.print("()");
            for (String s : ans) {
                System.out.print("(" + s + ")");
            }
            System.out.println();


        }
    }
}