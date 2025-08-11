// counting frequencies of array elements

import java.util.*;

public class A {

    // make a function
    public static void freq(int arr[], int n) {

        // build a hashmap
        Map<Integer, Integer> map = new HashMap<>();

        // traversing whole array
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // traversing through map and printing frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        freq(arr, n);
    }
}
