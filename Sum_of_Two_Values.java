import java.util.*;

public class Sum_of_Two_Values{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int matrix[][] = new int[n][2];
        for(int i = 0; i<n; i++){
            matrix[i][0] = sc.nextInt();
            matrix[i][1] = i + 1;
        }
        Arrays.sort(matrix, (a,b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n-1, flag = 0;
        while(left<right){
            if(matrix[left][0] + matrix[right][0] == sum){
                flag = 1;
                break;
            }
            else if(matrix[left][0] + matrix[right][0] < sum){
                left++;
            }
            else{
                right--;
            }
        }
        if(flag == 1)
            System.out.println(matrix[left][1] + " " + matrix[right][1]);
        else{
            System.out.println("IMPOSSIBLE");
        }
    }
}