// BLOCK 5 – DATA STRUCTURES & ALGORITHMS (Medium)

// Topic: Sliding Window

// Problem – Longest Substring Without Repeating Characters

// Input:
// "abcabcbb"

// Output:
// 3

// Explanation:
// "abc" is the longest substring.

// Python Solution

// def longestSubstring(s):
//     char_set = set()
//     left = 0
//     max_length = 0

//     for right in range(len(s)):
//         while s[right] in char_set:
//             char_set.remove(s[left])
//             left += 1
//         char_set.add(s[right])
//         max_length = max(max_length, right - left + 1)

//     return max_length

// Time Complexity: O(n)

//method 1=> brute force method

// import java.util.*;
// public class longestSubstring {
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         int max=0;
//         for(int i=0;i<s.length();i++){
//             HashSet<Character> set=new HashSet<>();
//             for(int j=i;j<s.length();j++){
//                 if(set.contains(s.charAt(j))){
//                     break;
//                 }else{
//                     set.add(s.charAt(j));
//                 }
//             }
//             max=Math.max(max,set.size());
//         }
//         System.out.println(max);
//     }
// }


//method 2=> o(n) time complexity and o(n) space complexity
import java.util.*;
public class longestSubstring {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0;
        HashSet<Character> set=new HashSet<>();
        int i=0,j=0;
        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }else{
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,set.size());
            }
        }
        System.out.println(max);
    }
}