// BLOCK 5 – DATA STRUCTURES & ALGORITHMS (Important Pattern)

// Topic: Two Pointers + Sorting

// Problem – Two Sum II (Sorted Array)

// Given a sorted array, return the indices of two numbers such that they add up to target.

// Example:

// nums = [2,3,4,7,11,15]
// target = 9

// Output:
// [1,3]

// Python Solution

// def twoSumSorted(nums, target):
//     left, right = 0, len(nums)-1

//     while left < right:
//         current = nums[left] + nums[right]

//         if current == target:
//             return [left, right]
//         elif current < target:
//             left += 1
//         else:
//             right -= 1

//     return [-1, -1]

// Time Complexity: O(n)


import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int left=0, right=n-1;
        while(left<right){
            int current=arr[left]+arr[right];
            if(current==target){
                System.out.println(left+" "+right);
                break;
            }else if(current<target){
                left++;
            }else{
                right--;
            }
        }
    }
}
