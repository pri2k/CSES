import java.util.*;

public class Missing_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n-1];
        int there[] = new int[n+1];
        for(int i = 0; i<n-1; i++){
            int x = sc.nextInt();
            there[x] = 1;
        }
        for(int i = 1; i<=n; i++){
            if(there[i] == 0){
                System.out.println(i);
                break;
            }
        }
        

    }
}