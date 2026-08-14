import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = {arr[0], arr[0]};

        IntStream.range(1, n).forEach(i -> {
            result[0] = Math.max(arr[i], result[0] + arr[i]);
            result[1] = Math.max(result[1], result[0]);
        });

        System.out.println(result[1]);

        sc.close();
    }
}


Input:
8
-2 -3 4 -1 -2 1 5 -3

Output:
7




