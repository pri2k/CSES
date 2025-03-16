import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Missing_Coin_Sum{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] coins = new int[n];
        String[] values = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(values[i]);
        }

        Arrays.sort(coins);
        int smallSum = 1;
        for(int coin: coins){
            if(coin>smallSum){
                break;
            }
            smallSum += coin;
        }
        System.out.println(smallSum);
    }
}