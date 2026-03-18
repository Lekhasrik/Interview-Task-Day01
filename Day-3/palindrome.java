
import java.util.*;
public class palindrome {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int ori=n;
       String rev="";
       while(n!=0){
        int temp=n%10;
        rev+=temp;
        n/=10;
       }
       int r= Integer.parseInt(rev);
       if(ori == r){
        System.out.println("True");
       }
       else{
        System.out.println("false");
       }
    }
}
