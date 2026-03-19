//method 1=> brute force method

// public class nonRepeatingChar {
//     public static void main(String []args){
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             char c=s.charAt(i);
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//         for(int i=0;i<s.length();i++){
//             if(map.get(s.charAt(i))==1){
//                 System.out.println(s.charAt(i));
//                 break;
//             }
//         }
//     }
// }



//method 2=> o(n) time complexity and o(n) space complexity
import java.util.*;
public class nonRepeatingChar {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
