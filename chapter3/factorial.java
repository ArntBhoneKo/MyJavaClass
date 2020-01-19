//Accept a numberfrom user and calculate the factorial of it.
package chapter3;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n,i,ans=1;
		System.out.print("input number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		ans=ans*i;
		System.out.println("factorial of " + n + " is "+ ans);
 sc.close();
	}

}
