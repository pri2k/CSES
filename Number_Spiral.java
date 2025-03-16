import java.util.*;

public class Number_Spiral {

    static long findDiagonal(int d) {
        return 1L + (long)(d - 1) * d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();
        while (t-- > 0) {
            int y = sc.nextInt();
            int x = sc.nextInt();

            if (x == y) {
                sb.append(findDiagonal(x)).append("\n");
            } else if (x > y) {
                long diagonal = findDiagonal(x);
                int steps = x - y;
                if ((x & 1) == 0) {
                    sb.append(diagonal - steps).append("\n");
                } else {
                    sb.append(diagonal + steps).append("\n");
                }
            } else {
                long diagonal = findDiagonal(y);
                int steps = y - x;
                if ((y & 1) == 0) {
                    sb.append(diagonal + steps).append("\n");
                } else {
                    sb.append(diagonal - steps).append("\n");
                }
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
