import java.util.*;

public class Two_Knights{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // long count = (n-2)*(n-1)*2L;
        StringBuilder ans = new StringBuilder();
        ans.append(0).append("\n");
        for(int i = 2; i<=n; i++){
            long max = i*i;
            max = max*(i*i-1)/2L;
            long count = (i-2)*(i-1)*4L;
            ans.append(max-count).append("\n");
        }
        System.out.println(ans);
    }
}