import java.util.*;

// use buffered reader for this answer to get accepted

public class Distinct_Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set= new HashSet<>();
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            set.add(x);
        }
        System.out.println(set.size());
    }
}