// Practice Problem

// Remove duplicates from sorted array

//method 1 => using hashset
// import java.util.*;
// public class duplicate {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         HashSet<Integer> set=new HashSet<>();
//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }
//         for (Integer i : set) {
//             System.out.print(i+" ");
//         }
//     }
// }


//method 2 => using two pointer
import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}