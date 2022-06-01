
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class YetAnotherReduceTo1Problem {
    public static int findMinSteps(int n, int arr[]) {
        if (n <= 1) return 0;
        if (arr[n] != 0) return arr[n];
        int steps = n;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0 && i % 2 == 1) {
                int remainSetps = findMinSteps(n - i, arr);
                steps = Math.min(steps, remainSetps);
            }
        }
        arr[n] = steps + 1;
        return arr[n];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        // for(int i=2;i<=n;i++){
        // 	arr[i] = -1;
        // }
        System.out.println(findMinSteps(n, arr));
    }
}