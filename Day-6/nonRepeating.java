// BLOCK 4 – PROBLEM SOLVING (Intermediate)

// Find the first non-repeating element in the array

// Input:
// [4,5,1,2,0,4,1,2]

// Output:
// 5

// Follow-up:
// Solve efficiently using hashing.

import java.util.*;
public class nonRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }       
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
