import java.util.*;
// logic and math

public class Coin_Piles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(((a+b)%3 == 0) && a>0 && b>0 && (a <= 2*b && b <= 2*a)){
                ans.append("YES\n");
            }
            else if(a == 0 && b == 0){
                ans.append("YES\n");
            }
            else{
                ans.append("NO\n");
            }
        }
        System.out.println(ans);
    }
}