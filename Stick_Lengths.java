import java.util.*;

public class Stick_Lengths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){ 
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int median;
        if(n%2 == 0){
            median = (arr[n/2] + arr[(n-1)/2])/2;
        }
        else{
            median = arr[n/2];
        }
        long cost = 0;
        for(int i = 0; i<n; i++){
            cost += Math.abs(arr[i] - median);
        }
        System.out.println(cost);
    }
}