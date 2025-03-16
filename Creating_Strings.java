import java.util.*;

// i dont know how permutations work

public class Creating_Strings{
    
    private static boolean nextPermutation(char[] array) {
        int n = array.length;

        // Step 1: Find the largest i such that array[i] < array[i + 1]
        // second last distinct character less than prev char
        int i = n - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }

        // If no such index exists, the array is in the highest possible order
        if (i < 0) {
            return false; // We are done with all permutations
        }

        // Step 2: Find the largest j such that array[i] < array[j]
        // third last distinct character
        int j = n - 1;
        while (array[j] <= array[i]) {
            j--;
        }

        // Step 3: Swap elements at i and j
        swap(array, i, j);

        // Step 4: Reverse the sequence from i + 1 to end
        reverse(array, i + 1, n - 1);
        return true; // Continue generating permutations
    }

    // Utility method to swap two characters
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Utility method to reverse part of the array
    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder ans = new StringBuilder();
        int count = 0;
        do {
            ans.append(new String(arr)).append("\n");
            count++;
        } while (nextPermutation(arr)); 
        System.out.println(count + "\n" + ans);
        sc.close();
    }
}