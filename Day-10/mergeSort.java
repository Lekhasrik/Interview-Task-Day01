import java.util.*;
public class mergeSort {
    public static void msort(int[] arr,int start,int mid,int end){
       
        int i=start, j=mid,k=start;
        int []res=new int[arr.length];
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
               res[k]=arr[i];
               i++;
               k++;
            }
            else{
                res[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            res[k]=arr[i];
            k++;
            i++;
        }
        while(j<end){
            res[k]=arr[j];
            k++;
            j++;
        }
        for(int n=start;n<end;n++){
            arr[n]=res[n];
        }
    }
    public static void mergeSort(int[] arr,int start,int end){
        if(end-start ==1)
             return;
        
        int mid=(start+end) /2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        msort(arr,start,mid,end);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}
