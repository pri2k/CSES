import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Collecting_Numbers_II {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        int[] arr = new int[n + 1];
        int[] pos = new int[n + 1];
        
        String[] elements = br.readLine().split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(elements[i - 1]);
            pos[arr[i]] = i;
        }

        StringBuilder ans = new StringBuilder();
        
        for (int j = 0; j < m; j++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            pos[arr[a]] = a;
            pos[arr[b]] = b;
            
            int rounds = 1;  
            for (int i = 2; i <= n; i++) {
                if (pos[i] < pos[i - 1]) {
                    rounds++;
                }
            }
            
            ans.append(rounds).append("\n");
        }
        
        System.out.print(ans);
    }
}
