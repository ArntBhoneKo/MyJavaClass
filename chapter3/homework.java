package chapter3;
import java.util.*;
public class homework {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double n,i,ans=1;
		System.out.print("input number");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		ans=ans*i;
		for(i=1;i<n;i++)
		System.out.print(i + " x ");
		System.out.print(n + " = " + ans);
 sc.close();
	}

}
