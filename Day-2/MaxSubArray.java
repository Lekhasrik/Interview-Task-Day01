//method - 1 = brute force

// import java.util.*;
// public class MaxSubArray {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             int pre=arr[i];
//             for(int j=i+1;j<n;j++){
//                pre=pre+arr[j];
//                if(pre>max){
//                 max=pre;
//                }
//             }
//         }
//         System.out.println(max);
//     }
// }



//method - 2 = kadane's algorithm by reseting the sum to 0 when it becomes negative 
// import java.util.*;
// public class MaxSubArray {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int []arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int max = arr[0];
//         int sum = 0;
//         for(int i=0;i<n;i++){
//             sum=sum+arr[i];
//             if(sum>max){
//                 max=sum;
//             }
//             if(sum<0){
//                 sum=0;
//             }
//         }
//         System.out.println(max);
//     }
// }

//method - 3 = kadane's algorithm
import java.util.*;
public class MaxSubArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cur=arr[0];
        int max=arr[0];
        for(int i=1;i<n;i++){
            cur=Math.max(arr[i],cur+arr[i]);
            max=Math.max(max,cur);
        }
        System.out.println(max);

    }
}


