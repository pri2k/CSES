import java.util.*;

public class Trailing_Zeros{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long count = 0;
        for(int i = 5; i<=n; i+= 5){
            long c = 0, x = i;
            while(x%25 == 0){
                c += 2;
                x/= 25;
            }
            if(c == 0 || x%5 == 0){
                c++;
            }
            count += c;
        }
   
        System.out.println(count);
    }
}