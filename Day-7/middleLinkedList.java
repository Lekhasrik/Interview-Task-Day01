// //method 1: using two pointer approach

// import java.util.Scanner;
// class Node {
//     int data;
//     Node next;
//     Node(int data) {
//         this.data=data;
//         this.next=null;
//     }
// }
// public class middleLinkedList {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Node head=null,temp=null;
//         for(int i=0;i<n;i++){
//             int val=sc.nextInt();
//             Node newNode=new Node(val);
//             if (head==null){
//                 head=newNode;
//                 temp=newNode;
//             }else{
//                 temp.next=newNode;
//                 temp=newNode;
//             }
//         }
//         Node slow=head,fast=head;
//         while(fast!=null&&fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         System.out.println(slow.data);
//     }
// }


//method 2: using length of linked list
import java.util.Scanner;
class Node {    
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
public class middleLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,temp=null;
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            Node newNode=new Node(val);
            if(head==null) {
                head=newNode;
                temp=newNode;
            }else{
                temp.next = newNode;
                temp = newNode;
            }
        }
        int mid= n/2;
        Node t=head;
        for(int i=0;i<mid;i++){
            t=t.next;
        }
        System.out.println(t.data);
    }
}