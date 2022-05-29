import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class InsertOperator {
    static boolean isKReached(long arr[], long sum, long k, int i) {
        if (i == arr.length) {
            if (sum == k) return true;
            else return false;
        }
        if (isKReached(arr, sum + arr[i], k, i + 1)) return true;
        return isKReached(arr, sum - arr[i], k, i + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
        if (isKReached(arr, arr[0], k, 1)) System.out.println("YES");
        else System.out.println("NO");

    }
}