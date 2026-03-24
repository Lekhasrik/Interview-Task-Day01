// BLOCK 4 – PROBLEM SOLVING

// Find the intersection of two arrays

// Input:
// arr1 = [1,2,3,4,5]
// arr2 = [3,4,5,6,7]

// Output:
// [3,4,5]

//method -1 => o(n^2)
import java.util.*;
public class intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==arr2[j]){
                    res.add(arr1[i]);
                }
            }
        }
        System.out.println(res);
    }
}

//method -2 using hashset
// import java.util.*;
// public class intersection {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr1[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr1[i]=sc.nextInt();
//         }
//         int arr2[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr2[i]=sc.nextInt();
//         }
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<n;i++){
//             set.add(arr1[i]);
//         }   
//         ArrayList<Integer> res=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             if(set.contains(arr2[i])){
//                 res.add(arr2[i]);
//             }
//         }
//         System.out.println(res);
//     }
// }
