import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ferris_Wheel {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int max = Integer.parseInt(firstLine[1]);
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        String[] weightsInput = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int weight = Integer.parseInt(weightsInput[i]);
            if (weight <= max) {
                arr.add(weight);
            }
        }
        
        Collections.sort(arr);
        
        int low = 0;
        int high = arr.size() - 1;
        int gondolas = 0;
        
        while (low <= high) {
            if (low == high) {
                gondolas++;
                break;
            }
            if (arr.get(low) + arr.get(high) <= max) {
                gondolas++;
                low++;
                high--;
            } else {
                gondolas++;
                high--;
            }
        }
        
        System.out.println(gondolas);
    }
}