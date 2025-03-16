import java.util.*;

public class Two_Sets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long sum = (long) n * (n + 1) / 2;
        StringBuilder ans = new StringBuilder();
        
        if(sum % 2 != 0) {
            ans.append("NO");
        } else {
            sum /= 2;
            long currSum = 0;
            ans.append("YES").append("\n");
            
            ArrayList<Integer> arr1 = new ArrayList<>();
            ArrayList<Integer> arr2 = new ArrayList<>();
            
            for(int i = n; i >= 1; i--) {
                if(i + currSum <= sum) {
                    arr1.add(i);
                    currSum += i;
                } else {
                    arr2.add(i);
                }
            }
            
            ans.append(arr1.size()).append("\n");
            for(int i = 0; i < arr1.size(); i++) {
                ans.append(arr1.get(i)).append(" ");
            }
            ans.append("\n").append(arr2.size()).append("\n");
            for(int i = 0; i < arr2.size(); i++) {
                ans.append(arr2.get(i)).append(" ");
            }
        }
        
        System.out.println(ans);
    }
}
