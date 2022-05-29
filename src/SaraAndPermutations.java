import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SaraAndPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        int start[] = new int[n + 1];
        int end[] = new int[n + 1];
        int num;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr[num] = i;
        }
        start[1] = arr[1];
        end[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            start[i] = Math.min(start[i - 1], arr[i]);
            end[i] = Math.max(end[i - 1], arr[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (end[i] - start[i] + 1 == i) System.out.print(1 + " ");
            else System.out.print(0 + " ");
        }

        //

    }
}