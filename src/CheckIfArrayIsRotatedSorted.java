
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckIfArrayIsRotatedSorted {
    static int arr[] = new int[1000006];

    static boolean isIncreasing(int n) {
        int id = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                id = i;
                break;
            }
        }


        if (id == 0) return false; //sorted with no rotation
        int curr = id + 1;
        while (curr != (id + n - 1)) {
            // System.out.println(arr[curr]+" "+arr[curr-1]);

            if (arr[curr] <= arr[curr - 1]) {
                return false;
            }

            curr++;
        }
        return true;
    }

    static boolean isDecreasing(int n) {
        int id = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                id = i;
                break;
            }
        }

        if (id == 0) return false; //sorted with no rotation
        int curr = id + 1;
        while (curr < (id + n - 1)) {
            if (arr[curr] >= arr[curr - 1]) {
                return false;
            }
            curr++;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arr[n + i] = arr[i];//TODO
            }

            if (isIncreasing(n) || isDecreasing(n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}