import java.util.*;

// gray code logic
// representing decimal in binary logic
// adding padding so that 0 is 0000

public class Gray_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < (1 << n); i++) {
            int xor = i ^ (i >> 1);
            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(xor)).replace(' ', '0');
            ans.append(binaryString).append("\n");
        }
        
        System.out.println(ans.toString());
    }
}
