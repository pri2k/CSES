import java.util.*;

public class Restaurant_Customers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int dep[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            dep[i] = sc.nextInt();
        }
        int max = 0, curr = 0, i = 0, j = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        while(i<n){
            if(i<n && arr[i] <= dep[j]){
                curr++;
                i++;
            }
            if(i<n && dep[j] < arr[i]){
                max = Math.max(max, curr);
                curr--;
                j++;
            }
        }
        max = Math.max(max, curr);
        System.out.println(max);
    }
}