import java.util.*;

public class Palindrome_Reorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            freq.put(currentChar, freq.getOrDefault(currentChar, 0) + 1);
        }
        
        List<Integer> values = new ArrayList<>(freq.values());
        int oddCount = 0;
        char oddChar = 0;
        for (int count : values) {
            if (count % 2 != 0) {
                oddCount++;
                oddChar = (char) count; 
            }
            if (oddCount > 1) {
                System.out.println("NO SOLUTION");
                return;
            }
        }
        
        StringBuilder front = new StringBuilder();        
        for (Character c : freq.keySet()) {
            int n = freq.get(c);
            front.append(String.valueOf(c).repeat(n / 2)); 
            
            if (n % 2 != 0) {
                oddChar = c;
            }
        }
        
        String palindrome = front.toString();
        if (oddCount == 1) {
            palindrome += oddChar;
        }
        palindrome += front.reverse().toString();
        
        System.out.println(palindrome);
    }
}
