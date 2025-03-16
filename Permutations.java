import java.util.*;

public class Permutations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        if(n == 3 || n == 2){
            System.out.println("NO SOLUTION");
        }
        else{
            if( (n&1) == 0){
                int num = 1;
                for(int i = n-2; i>=0; i -= 2){
                    arr[i] = num;
                    num++;
                }
                for(int i = n-1; i>=0; i-=2){
                    arr[i] = num;
                    num++;
                }
            }
            else{
                int num = 1;
                for(int i = n-1; i>=0; i -= 2){
                    arr[i] = num;
                    num++;
                }
                for(int i = n-2; i>=0; i-=2){
                    arr[i] = num;
                    num++;
                }
            }
            StringBuilder s = new StringBuilder();
            for(int i = 0; i<n; i++){
                s.append(arr[i]).append(" ");
            }
            System.out.println(s.toString());
        }

    }
}


// 2 4 1 3

// 3 5 2 4 1 

// 3 6 2 5 1 4
