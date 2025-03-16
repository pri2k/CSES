import java.util.*;

public class Playlist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){ 
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        int max = 0, low = 0;
        for(int i = 0; i<n; i++){ 
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