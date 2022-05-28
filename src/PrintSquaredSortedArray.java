import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class PrintSquaredSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            int res[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int left = 0, right = n - 1, i = n - 1;
            while (left <= right) {
                int l = arr[left] * arr[left];
                int r = arr[right] * arr[right];
                if (l > r) {
                    res[i] = l;
                    i--;
                    left++;
                } else {
                    res[i] = r;
                    i--;
                    right--;
                }
            }
            for (int k : res) System.out.print(k + " ");
            System.out.println();
            tc--;
        }
    }

}