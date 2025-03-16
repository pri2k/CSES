import java.util.*;

public class Weird_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        long n = m;
        StringBuilder output = new StringBuilder();
        output.append(n);

        while (n != 1) {
            if ((n & 1) == 0) {
                n /= 2;
            } else {
                n *= 3;
                n++;
            }
            output.append(" ").append(n);
        }
        System.out.print(output.toString());
    }
}
