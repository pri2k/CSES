import java.util.*;

public class Increasing_Array{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        long count = 0;
        for(int i = 1; i<n; i++){
            int curr = sc.nextInt();
            if(prev > curr){
                count += prev - curr;
                curr = prev;
            }
            prev = curr;
        }
        
        // for(int i = 1; i<n; i++){
        //     if(arr[i-1]>arr[i]){
        //         count += arr[i-1]-arr[i];
        //         arr[i] = arr[i-1];
        //     }
        // }
        System.out.println(count);
        sc.close();
    }
}