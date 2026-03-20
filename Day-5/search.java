
// BLOCK 5 – DATA STRUCTURES & ALGORITHMS (Important Pattern)

// Topic: Binary Search

// Problem – Search in Sorted Array

// Given a sorted array, find index of target element.

// Example:

// nums = [1,2,3,4,5,6,7]
// target = 5

// Output:
// 4

// Python Solution

// def binarySearch(nums, target):
//     left, right = 0, len(nums)-1

//     while left <= right:
//         mid = (left + right)//2

//         if nums[mid] == target:
//             return mid
//         elif nums[mid] < target:
//             left = mid + 1
//         else:
//             right = mid - 1

//     return -1

// Time Complexity: O(log n)



//method 1 => Lineer search => O(n) time complexity

// import java.util.*;
// public class search {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int target = sc.nextInt();
//         int left=0;
//         int right=n-1;
//         while(left<right){
//             if(arr[left]==target){
//                 System.out.println(left);
//                 break; 
//             }else if(arr[right]==target){
//                 System.out.println(right);
//                 break;
//         }
//         left++;
//         right--;
//     }
// }
// }

//method 2 => binary search => O(log n) time complexity
import java.util.*;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break; 
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
}
}
