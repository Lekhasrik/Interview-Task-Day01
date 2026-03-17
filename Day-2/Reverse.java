// BLOCK 4 – PROBLEM SOLVING

// Reverse a Number

// Input
// 1234

// Output
// 4321

// Hint

// Use:
// remainder = n % 10
// n = n // 10

import java.util.*;
public class Reverse
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String res="";
		while(n!=0){
            int temp=n%10;
			res+=temp;
			n=n/10;
		}
	    System.err.println(Integer.parseInt(res));
	}
}