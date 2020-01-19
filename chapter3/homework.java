package chapter3;
import java.util.*;
public class homework {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i,ans=1;
		System.out.print("input number");
		n=sc.nextInt();
		System.out.print(n + "!=");
		for(i=1;i<=n;i++)
		ans=ans*i;
		for(i=1;i<n;i++)
		System.out.print(i + "*");
		System.out.print(n + "=" + ans);
 sc.close();
	}

}
