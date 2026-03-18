//method-1 => using StringBuilders

// import java.util.*;
// public class reverseString {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder str=new StringBuilder(s).reverse();
//         System.out.println(str);
//     }
// }



//method-2 => using two pointers

import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        char[] ch=s.toCharArray();
        int left=0;
        int rigth=ch.length - 1;
        while(left<rigth){
            char temp=ch[left];
            ch[left]=ch[rigth];
            ch[rigth]=temp;

            left++;
            rigth--;
        }
        String rev=new String(ch);
        System.out.println(rev);
    }
}
