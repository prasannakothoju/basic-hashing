import java.util.*; // importing all utility tools including Scanner

public class A {
    public static void main(String[] args) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Ask how many numbers the user will enter

        // Creating an array to store n numbers
        int[] arr = new int[n];

        // Taking n numbers from user and storing in arr
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precomputing: creating a frequency array
        // 13 slots (index 0 to 12) to count how many times each number appears
        int[] hash = new int[13];

        // Count frequency of each number from arr and store in hash
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // Ask how many times the user wants to query (ask questions)
        int q = sc.nextInt();

        // Answer each query
        while (q-- != 0) {
            int num = sc.nextInt(); // The number user is asking about
            System.out.println(hash[num]); // Print how many times it appeared
        }
    }
}
