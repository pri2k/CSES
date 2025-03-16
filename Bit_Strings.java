import java.util.*;

public class Bit_Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = 1000000007;
        long base = 2, result = 1;
        while(n>0){
            if(n%2 != 0){
                result = (result*base)%mod;
            }
            base = (base*base)%mod;
            n = n/2;
        }
        System.out.println(result);
    }
}