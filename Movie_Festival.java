import java.util.*;

public class Movie_Festival{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int movies[][] = new int[n][2];
        for(int i = 0; i<n; i++){
            movies[i][0] = sc.nextInt();
            movies[i][1] = sc.nextInt();
        }

        Arrays.sort(movies, (a,b) -> Integer.compare(a[1], b[1]));

        int count = 1, end = movies[0][1];
        for(int i = 1; i<n; i++){
            if(movies[i][0]>= end){
                count++;
                end = movies[i][1];
            }
        }

        System.out.println(count);
    }
}