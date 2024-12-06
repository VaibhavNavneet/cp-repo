import java.util.*;

public class D_Digital_string_maximization {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        while (t-- > 0) {
            String s = in.nextLine();
            char[] arr = s.toCharArray();

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] - arr[i] >= 2) {
                    int temp =arr[i];
                    arr[i] = (char) (arr[i + 1] - 1);
                    arr[i + 1] = (char) (temp);

                    if (i > 0) {
                        i -= 2;
                    }
                }
            }

            System.out.println(new String(arr));
        }

        in.close();
    }
}
