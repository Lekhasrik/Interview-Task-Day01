//method-1 => using stringBuilder

// import java.util.*;
// public class validPalindrome {
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//         String rev=new StringBuilder(s).reverse().toString();;
//         if(s.equals(rev)){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
//     }
// }

//method - 2 => Using Two Pointer
import java.util.*;
public class validPalindrome {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str=s.toLowerCase().replace(" ","");

        int left=0;
        int rigth=0;
        boolean ispalin=true;
        while(left<rigth){
            if(str.charAt(left)!=str.charAt(rigth)){
                ispalin=false;
                return;
            }
            left++;
            rigth--;
        }
        if(ispalin){
            System.out.println("True");
        }else{
            System.out.println("Fasle");
        }
    }
}
