import java.util.*;
public class B_Triangles_on_a_Rectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Keep `t` as int since it represents the number of test cases.
        while (t-- > 0) {
            long w = in.nextLong();
            long h = in.nextLong();
            
            int k1 = in.nextInt();
            long arr1[] = new long[k1];
            for (int i = 0; i < k1; i++)
                arr1[i] = in.nextLong() * h;

            int k2 = in.nextInt();
            long arr2[] = new long[k2];
            for (int i = 0; i < k2; i++)
                arr2[i] = in.nextLong() * h;

            int k3 = in.nextInt();
            long arr3[] = new long[k3];
            for (int i = 0; i < k3; i++)
                arr3[i] = in.nextLong() * w;

            int k4 = in.nextInt();
            long arr4[] = new long[k4];
            for (int i = 0; i < k4; i++)
                arr4[i] = in.nextLong() * w;

            long x1 = arr1[k1 - 1] - arr1[0];
            long x2 = arr2[k2 - 1] - arr2[0];
            long y1 = arr3[k3 - 1] - arr3[0];
            long y2 = arr4[k4 - 1] - arr4[0];

            System.out.println(Math.max(Math.max(x1, x2), Math.max(y1, y2)));
        }
    }
}
