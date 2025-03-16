import java.util.*;

public class Concert_Tickets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> tickets = new ArrayList<>();
        int cust[] = new int[m];
        for(int i = 0; i<n; i++){
            int t = sc.nextInt();
            tickets.add(t);
        }
        int max = 0;
        for(int i = 0; i<m; i++){
            cust[i] = sc.nextInt();
            max = Math.max(max,cust[i]);
        }
        // for(int i = 0; i<n; i++){
        //     int t = tickets.get(i);
        //     if(t>max){
        //         tickets.remove(i);
        //     }
        // }
        Collections.sort(tickets);
        for(int i = 0; i<m; i++){
            cust[i] = price(tickets, cust[i]);
            System.out.println(cust[i]);
        }
    }

    static int price(ArrayList<Integer> tickets, int max) {
        int low = 0, high = tickets.size() - 1;
        int result = -1;
        
        while (low <= high){
            int mid = (low + high) / 2;
            int num = tickets.get(mid);
            if (num <= max){
                result = num; 
                low = mid + 1; 
            } 
            else{
                high = mid - 1;
            }
        }
        
        if(result != -1){
            tickets.remove(tickets.indexOf(result));
        }
        return result;
    }
}