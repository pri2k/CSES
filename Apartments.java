import java.util.*;

public class Apartments{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int desired[] = new int[n];
        int sizes[] = new int[m];
        for(int i = 0; i<n; i++){
            desired[i] = sc.nextInt();
        }
        for(int i = 0; i<m; i++){
            sizes[i] = sc.nextInt();
        }
        if(m != 1){
            Arrays.sort(desired);
            Arrays.sort(sizes);
            int count = 0, d = 0, s = 0;
            while(d<n && s<m){
                if(desired[d] - k <= sizes[s] && sizes[s] <= desired[d] + k){
                    count++;
                    d++;
                    s++;
                }
                else if(desired[d] - k > sizes[s]){
                    s++;
                }
                else{
                    // sizes[s] > desired[d] + k
                    d++;
                }
            }
            System.out.println(count);
        }
        else{
            int num = sizes[0];
            int count = 0;
            for(int i = 0; i<n; i++){
                if(desired[i]-k <= num && num <= desired[i] + k){
                    count = 1;
                    break;
                }
            }
            System.out.println(count);
        }
    }
}