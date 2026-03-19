//method 1=> brute force method

// import java.util.Scanner;
// public class duplicates {
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     System.out.println(arr[i]);
//                 }
//             }
//         }
//     }
// }


//method 2 => o(n) time complexity and o(n) space complexity
import java.util.*;   
public class duplicates {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
    }
}
