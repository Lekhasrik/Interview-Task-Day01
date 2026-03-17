//method 1 = brute force

// import java.util.*;
// public class secoundLargest {
//     public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int arr[]=new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }    
//        Arrays.sort(arr);
//        System.out.println(arr[n-2]);
//     }
// }


//method 2 = DSA approach
import java.util.*;
public class secoundLargest {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }    
       int first=Integer.MIN_VALUE;
       int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first) {
                second=arr[i];
            }
        }
        System.out.println(second);
    }
}