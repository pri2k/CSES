import java.util.*;

public class Apple_Division{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        long sum = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for(int i = 0; i<(1<<n); i++){
            long curr = 0, otherCurr = 0;
            for(int j = 0; j<n; j++){
                if((i&(1<<j)) != 0){
                    curr += arr[j];
                }
            }
            otherCurr = sum - curr;
            min = Math.min(Math.abs(curr - otherCurr), min);
        }
        System.out.println(min);
    }
}