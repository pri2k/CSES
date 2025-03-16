import java.util.*;

public class Tower_of_Hanoi {
    static int moves = 0;
    static StringBuilder ans = new StringBuilder();

    static void tower(int n, int first, int last, int middle) {
        if (n == 1) {
            ans.append(first).append(" ").append(last).append("\n");
            moves++;
            return;
        }
        tower(n - 1, first, middle, last);
        ans.append(first).append(" ").append(last).append("\n"); 
        moves++;
        tower(n - 1, middle, last, first);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tower(n, 1, 3, 2);
        System.out.println(moves);
        System.out.println(ans);
    }
}
