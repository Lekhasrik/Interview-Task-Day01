// Practice Problem

// Find square root of a number using binary search


// Approach 1 => O(sqrt(n)) time complexity
import java.util.*;
public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left=0;
        int right=n;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid*mid==n){
                System.out.println(mid);
                break; 
            }else if(mid*mid>n){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
    }
}
