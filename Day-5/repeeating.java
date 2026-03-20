// BLOCK 4 – PROBLEM SOLVING (Intermediate)

// Find first repeating element in array

// Input:
// [1,2,3,4,2,5,3]

// Output:
// 2

// Follow-up:
// Solve efficiently using hashing.

import java.util.*;
public class repeeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
                break;
            }else{
                set.add(arr[i]);
            }
        }
    }
}

