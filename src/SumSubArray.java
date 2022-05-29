
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
        int mini = n;
        // for(int i=0;i<n;i++){
        int i = 0;
        long sum = 0;
        for (int j = 0; j < n; j++) {
            while (i < n && sum < k) {
                sum += arr[i];
                i++;
            }

            if (sum >= k) {
                int diff = i - j;
                if (diff < mini) {
                    mini = diff;
                }
            }
            sum -= arr[j];
        }
        // }
        System.out.println(mini);
    }
}