
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestDistinctCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            String s = sc.next();
            int n = s.length();

            int arr[] = new int[256];
            for (int i = 0; i < 256; i++) arr[i] = -1;
            int i = 0;
            int maximum = 0; // assuming the longest substring 0
            for (int j = 0; j < n; j++) {
                int num = (int) s.charAt(j);
                if (i < arr[num] + 1) {
                    i = arr[num] + 1;
                }
                int diff = j - i + 1;
                if (maximum < diff) {
                    maximum = diff;
                }
                arr[num] = j;
            }

            System.out.println(maximum);
            testcase--;
        }

    }
}