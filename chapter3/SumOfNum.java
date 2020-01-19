/*write a program to accept 10 numbers from user
 * and display the result of their sum.
 */
package chapter3;
import java.util.*;
public class SumOfNum {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 0 to get sum of entered number");
		System.out.print("enter nmber");
		n=sc.nextInt();
		while(n!=0)
		{sum+=n;
		System.out.print("enter nmber");
		n=sc.nextInt();}
		System.out.println("sum="+sum);

	}

}
