import java.util.*;

public class Repetitions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long max = 1, window = 1;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                window++;
            }
            else{
                max = Math.max(max,window);
                window = 1;
            }
        }
        max = Math.max(max,window);
        System.out.println(max);
    }
}