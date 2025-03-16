import java.io.*;
import java.util.*;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){ 
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashSet<Integer> set = new HashSet<>();
        int max = 0, low = 0;
        for(int i = 0; i < n; i++){ 
            while(set.contains(arr[i])){
                set.remove(arr[low]);
                low++;
            }
            set.add(arr[i]);
            max = Math.max(max, i - low + 1);
        }
        System.out.println(max);
    }
}
